import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hongguan.liu
 * Created at: 2021/3/9
 **/
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new LinkedList<>();

        for (int i = 0; i < nums.length - 3; i++){
            if (i > 0 && nums[i -1] == nums[i]){
                continue;
            }
            for (int j = i+1; j < nums.length - 2; j++){
                if (j > i+1 && nums[j - 1] == nums[j]){
                    continue;
                }

                int left = j+1;
                int right = nums.length - 1;

                while (left < right){
                    if (nums[i] + nums[j] + nums[left] + nums[right] == target){
                        List<Integer> list = new LinkedList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        ans.add(list);

                        while (left < right && nums[left++] == nums[left]);
                        while (left < right && nums[right--] == nums[right]);
                    }else if (nums[i] + nums[j] + nums[left] + nums[right] < target){
                        while (left < right && nums[left++] == nums[left]);
                    }else{
                        while (left < right && nums[right--] == nums[right]);
                    }
                }
            }
        }
        return ans;
    }
}
