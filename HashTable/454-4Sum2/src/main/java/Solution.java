import java.util.HashMap;
import java.util.Map;

/**
 * @author hongguan.liu
 * Created at: 2021/3/3
 **/
public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> record = new HashMap<>();
        int ans = 0;

        for (int a : A) {
            for (int b : B) {
                int sumAB = a + b;
                if (record.containsKey(sumAB)) {
                    record.put(sumAB, record.get(sumAB) + 1);
                } else {
                    record.put(sumAB, 1);
                }
            }
        }

        for (int c : C){
            for (int d : D){
                int sumCD =  c + d;
                ans += record.getOrDefault(-sumCD, 0);
            }
        }

        return ans;
    }

}
