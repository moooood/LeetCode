import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hongguan.liu
 * Created at: 2021/4/8
 **/
public class Solution {
    List<Integer> path = new LinkedList<>();
    List<List<Integer>> res = new LinkedList<>();

    public void backTracking(int[] nums, int startIndex){
        if (path.size() > 1){
            res.add(new LinkedList<>(path));
        }

//        HashSet<Integer> used = new HashSet<>();
        int[] used = new int[201];
        for (int i = startIndex; i < nums.length; i++){
            if (!path.isEmpty() && nums[i] < path.get(path.size() - 1) || used[nums[i] + 100] == 1){
                continue;
            }

            used[nums[i] + 100] = 1;
            path.add(nums[i]);
            backTracking(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }

    public List<List<Integer>> findSubsequences(int[] nums) {
        if (null == nums || nums.length == 0) return res;
        backTracking(nums, 0);
        return res;
    }

    public static void main(String[] args){
        int[] nums = new int[]{4, 7, 6, 7};
        System.out.println(new Solution().findSubsequences(nums));
    }
}
