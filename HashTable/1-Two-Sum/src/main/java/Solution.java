import java.util.HashMap;
import java.util.Map;

/**
 * @author hongguan.liu
 * Created at: 2021/3/3
 **/
public class Solution {
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> record = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(record.containsKey(complement)){
                return new int[] {record.get(complement), i};
            }else{
                record.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two Sum solution");
    }
}
