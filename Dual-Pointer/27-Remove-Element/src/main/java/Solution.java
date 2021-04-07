/**
 * @author hongguan.liu
 * Created at: 2021/3/8
 **/
public class Solution {
    public int removeElement(int[] nums, int val) {
        int slowIndex = 0;

        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++){
            if (val != nums[fastIndex]){
                nums[slowIndex++] = nums[fastIndex];
            }
        }
        return slowIndex;
    }
}
