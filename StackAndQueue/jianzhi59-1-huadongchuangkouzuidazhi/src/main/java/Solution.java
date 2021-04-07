import java.util.*;

/**
 * @author hongguan.liu
 * Created at: 2021/3/9
 **/
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Integer[] numsInteger = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numsInteger, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        Deque<Integer> queue = new LinkedList<>();
        Integer[] ans = new Integer[nums.length - k + 1];

        int count = 0;
        while (count < k){
            queue.addLast(numsInteger[count++]);
        }

        for (int i = 1; i < nums.length - k + 1; i++){
            ans[i - 1] = queue.pollFirst();
            if (i < nums.length - k){
                queue.addLast(numsInteger[i+k]);
            }
        }

        return Arrays.stream(ans).boxed().toArray(int[]::new);
    }

    public static void main(String[] args){
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        Integer[] what = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        System.out.println(new Solution().maxSlidingWindow(nums, k));
    }
}
