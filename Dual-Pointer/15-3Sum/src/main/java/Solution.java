import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hongguan.liu
 * Created at: 2021/3/9
 **/
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans  = new LinkedList<>();

        for (int i = 0; i < nums.length - 2; i++){
            if(nums[i] > 0){
                return ans;
            }

            int left = i+1;
            int right = nums.length - 1;

            if ( i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    List<Integer> list = new LinkedList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    ans.add(list);
                    while (left < right && nums[left++] == nums[left]) ;
                    while (left < right && nums[right--] == nums[right]) ;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    while (left < right && nums[left++] == nums[left]) ;
                } else {
                    while (left < right && nums[right--] == nums[right]) ;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(new Solution().threeSum(nums));
    }
}
