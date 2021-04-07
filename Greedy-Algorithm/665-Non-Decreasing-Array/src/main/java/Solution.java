/**
 * @author hongguan.liu
 * Created at: 2021/2/4
 **/
public class Solution {
    public boolean checkPossibility(int[] nums) {
       int cnt = 0;
       int length = nums.length;
       for (int i = 1; i<length&&cnt<=1; i++){
           if (nums[i] < nums[i-1]){
               cnt++;
               if(i>=2 && nums[i-2] > nums[i])
                   nums[i] = nums[i-1];
           }
       }
       return cnt <= 1;
    }

    public static void main(String[] args){
        int[] nums = {5,7,1,8};
        System.out.println(new Solution().checkPossibility(nums));
    }
}
