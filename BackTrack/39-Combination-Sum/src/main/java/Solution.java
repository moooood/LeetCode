import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hongguan.liu
 * Created at: 2021/4/7
 **/
public class Solution {
    List<List<Integer>> res = new LinkedList<>();
    List<Integer> path = new LinkedList<>();
    int sum = 0;

    public void backTracking(int[] candidates, int target, int startIndex){
        if (sum > target)
            return;

        if (sum == target){
            res.add(new LinkedList<>(path));
            return;
        }

        for (int i = startIndex; i < candidates.length && sum + candidates[i] <= target; i++){
            path.add(candidates[i]);
            sum += candidates[i];
            backTracking(candidates, target, i);
            path.remove(path.size() - 1);
            sum -= candidates[i];
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (null == candidates || candidates.length == 0) return null;
        Arrays.sort(candidates);
        backTracking(candidates, target, 0);
        return res;
    }
}
