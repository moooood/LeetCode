/**
 * @author hongguan.liu
 * Created at: 2021/2/26
 **/
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid]>target)
                right = mid -1;
            else if(nums[mid]<target)
                left = mid + 1;
            else
                return mid;
        }

        return right + 1;
    }
}
