import java.util.Arrays;

/**
 * @author hongguan.liu
 * Created at: 2021/3/2
 **/
public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target){
                ans = Math.min((j - i + 1), ans);
                sum -= nums[i++];
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
