import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hongguan.liu
 * Created at: 2021/4/8
 **/
public class Solution {

    List<Integer> path = new LinkedList<>();
    List<List<Integer>> res = new LinkedList<>();
    List<Boolean> used = new LinkedList<>();

    public void backTracking(int[] nums){
        if (path.size() == nums.length){
            res.add(new LinkedList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++){
            if (used.get(i)) continue;

            if (i > 0 && nums[i] == nums[i-1] && !used.get(i-1)) continue;

            used.set(i, true);
            path.add(nums[i]);
            backTracking(nums);
            used.set(i, false);
            path.remove(path.size() - 1);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        if (null == nums || nums.length == 0) return res;

        for (int i = 0; i < nums.length; i++){
            used.add(false);
        }
        Arrays.sort(nums);
        backTracking(nums);
        return res;
    }
}
