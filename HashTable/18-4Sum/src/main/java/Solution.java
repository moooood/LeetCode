import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hongguan.liu
 * Created at: 2021/3/4
 **/
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++){
            if (i > 0 && nums[i] == nums[i-1])
                continue;

            for (int j = i+1; j < nums.length - 2; j++){
                if (j > i + 1 && nums[j] == nums[j-1])
                    continue;

                int left = j + 1;
                int right = nums.length - 1;

                while (left < right){

                    if (nums[i] + nums[j] + nums[left] + nums[right] == target){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        ans.add(list);
                        while (left < right && nums[left++] == nums[left]);
                        while (left < right && nums[right--] == nums[right]);
                    }else if (nums[i] + nums[j] + nums[left] + nums[right] < target){
                        while (left < right && nums[left++] == nums[left]);
                    }else {
                        while (left < right && nums[right--] == nums[right]);
                    }
                }
            }
        }
        return ans;
    }
}
