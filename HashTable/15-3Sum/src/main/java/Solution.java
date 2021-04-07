import java.util.*;

/**
 * @author hongguan.liu
 * Created at: 2021/3/4
 **/
public class Solution {
    public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0)
                return ans;

            if (i > 0 && nums[i] == nums[i-1])
                continue;

            Set<Integer> set = new HashSet<>();
            for (int j = i+1; j < nums.length; j++){
                if (j > i + 2 && nums[j] == nums[j-1] && nums[j-1] == nums[j-2]){
                    continue;
                }
                int c = -(nums[i] + nums[j]);
                if (set.contains(c)){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(c);
                    ans.add(list);
                    set.remove(c);
                }else {
                    set.add(nums[j]);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {1,-1,-1,0,0,1};
        System.out.println(new Solution().threeSum(nums));
    }
}
