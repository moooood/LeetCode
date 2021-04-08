import java.util.LinkedList;
import java.util.List;

/**
 * @author hongguan.liu
 * Created at: 2021/4/7
 **/
public class Solution {
    List<List<Integer>> res = new LinkedList<>();
    List<Integer> path = new LinkedList<>();

    public void backTracking(int[] nums, int startIndex){
        res.add(new LinkedList<>(path));
        if (startIndex >= nums.length){
            return;
        }

        for (int i = startIndex; i < nums.length; i++){
            path.add(nums[i]);
            backTracking(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        if (null == nums || nums.length == 0) return null;
        backTracking(nums, 0);
        return res;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1, 2, 3};
        new Solution().subsets(nums);
    }
}
