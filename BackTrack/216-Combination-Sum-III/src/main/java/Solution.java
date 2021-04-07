import java.util.LinkedList;
import java.util.List;

/**
 * @author hongguan.liu
 * Created at: 2021/4/6
 **/
public class Solution {
    List<List<Integer>> result = new LinkedList<>();
    List<Integer> path = new LinkedList<>();
    int sum = 0;

    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracking(k, n, 1);
        return result;
    }

    public void backTracking(int k, int n, int startIndex){
        if (sum > n){
            return;
        }

        if (path.size() == k && sum == n){
            result.add(new LinkedList<>(path));
            return;
        }

        if (path.size() < k) {
            for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
                path.add(i);
                sum += i;
                backTracking(k, n, i + 1);
                path.remove(path.size() - 1);
                sum -= i;
            }
        }
    }

    public static void main(String[] args){
        System.out.println(new Solution().combinationSum3(3,7));
    }
}
