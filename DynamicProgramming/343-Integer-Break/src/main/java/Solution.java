import java.util.ArrayList;
import java.util.List;

/**
 * @author hongguan.liu
 * Created at: 2021/4/19
 **/
public class Solution {
    public int integerBreak(int n){
        int[] dp = new int[n+1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++){
            for (int j = 1; j < i - 1; j++){
                dp[i] = Math.max(dp[i], Math.max((i - j) * j, dp[i - j] * j));
            }
        }
        return dp[n];
    }
}
