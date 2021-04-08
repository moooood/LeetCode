import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hongguan.liu
 * Created at: 2021/4/7
 **/
public class Solution {
    List<Boolean> used = new LinkedList<>();
    List<Integer> path = new LinkedList<>();
    List<List<Integer>> res = new LinkedList<>();

    public void backTracking(int[] nums, int startIndex){
        res.add(new LinkedList<>(path));

        if (startIndex >= nums.length){
            return;
        }

        for (int i = startIndex; i < nums.length; i++){

            if (i > 0 && nums[i] == nums[i-1] && !used.get(i-1)){
                continue;
            }

            path.add(nums[i]);
            used.set(i, true);
            backTracking(nums, i+1);
            used.set(i, false);
            path.remove(path.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            used.add(false);
        }
        Arrays.sort(nums);
        backTracking(nums, 0);
        return res;
    }


}
