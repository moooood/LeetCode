import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hongguan.liu
 * Created at: 2021/4/7
 **/
public class Solution {
    int sum = 0;
    List<List<Integer>> res = new LinkedList<>();
    List<Integer> path = new LinkedList<>();
    List<Boolean> used = new LinkedList<>();

    public void backTracking(int[] candidates, int target, int startIndex){
        if (sum > target)
            return;

        if (sum == target){
            List<Integer> element = new LinkedList<>(path);
            res.add(new LinkedList<>(element));
            return;
        }

        for (int i = startIndex; i < candidates.length && sum + candidates[i] <= target; i++){
            if (i > 0 && candidates[i] == candidates[i - 1] && !used.get(i-1)){
                continue;
            }

            used.set(i, true);
            path.add(candidates[i]);
            sum += candidates[i];
            backTracking(candidates, target, i+1);
            used.set(i, false);
            sum -= candidates[i];
            path.remove(path.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (null == candidates || candidates.length == 0) return null;
        for (int i = 0; i < candidates.length; i++){
            used.add(false);
        }
        Arrays.sort(candidates);
        backTracking(candidates, target, 0);
        return res;
    }

    public static void main(String[] args){
//        int[] candidates = new int[]{10, 1, 2, 7, 6, 1, 5};
//        int target = 8;
//        System.out.println(new Solution().combinationSum2(candidates, target));

        List<Boolean> used = new LinkedList<>();
        System.out.println(used);
    }
}
