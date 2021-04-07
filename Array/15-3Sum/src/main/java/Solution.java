import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hongguan.liu
 * Created at: 2021/2/26
 **/
public class Solution {

    public List<List<Integer>> threeSum(int[] nums){

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){

            if(nums[i] > 0)
                return result;

            if(i>0 && nums[i] == nums[i-1])
                continue;

            int left = i+1;
            int right = nums.length - 1;
            while(left < right){
                if(nums[i] + nums[left] + nums[right] == 0){
                    List<Integer> list =  new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);
                    while(left < right && nums[left] == nums[left+1])
                        left++;
                    while(left < right && nums[right-1] == nums[right])
                        right--;
                    left++;
                    right--;
                }else if (nums[i] + nums[left] + nums[right] < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(new Solution().threeSum(nums));
    }

}
