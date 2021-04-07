/**
 * @author hongguan.liu
 * Created at: 2021/2/3
 **/
public class Solution {
    public int maxProfit(int[] prices) {
        int ans  = 0;
        int length = prices.length;
        for (int i = 1; i<length; i++){
            ans += Math.max(0, prices[i] - prices[i-1]);
        }
        return ans;
    }

    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(new Solution().maxProfit(prices));
    }
}
