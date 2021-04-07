import java.util.HashMap;
import java.util.Map;

/**
 * @author hongguan.liu
 * Created at: 2021/3/1
 **/
public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int a : A)
            for (int b : B) {
                int sumAB = a + b;
                if (map.containsKey(sumAB))
                    map.put(sumAB, map.get(sumAB) + 1);
                else
                    map.put(sumAB, 1);
            }

        int ans = 0;
        for (int c : C)
            for(int d : D){
                int sumCD = c + d;
                ans += map.getOrDefault(-sumCD, 0);
            }
        return ans;
    }

    public static void main(String[] args){
        int[] A = {1, 2};
        int[] B = {-2, -1};
        int[] C = {-1, 2};
        int[] D = {0, 2};

        System.out.println(new Solution().fourSumCount(A, B, C, D));
    }
}
