import java.util.Arrays;
import java.util.Random;

/**
 * @author hongguan.liu
 * Created at: 2021/2/23
 **/
public class Solution {
    Random random = new Random();

    public int findKthLargest(int[] nums, int k) {
        return kLargeestNum(nums, 0, nums.length-1, nums.length -k);
    }

    public int kLargeestNum(int[] nums, int low, int high, int index){
        int q = quickSort(nums, low, high);

        if( q == index){
            return nums[q];
        }
        else{
            return q<index?kLargeestNum(nums, q+1, high, index) : kLargeestNum(nums, low, q -1, index);
        }
    }

    public int quickSort(int[] nums, int low, int high){
        int choose = random.nextInt(high-low+1) + low;
        swap(nums, choose, high);

        int i, j, tmp;

        i = low;
        j = high;

        tmp = nums[low];

        while(i < j){
            while (nums[j] >= tmp && i < j){
                j--;
            }
            while (nums[i] <= tmp && i < j){
                i++;
            }
            if(i<j){
                swap(nums, i, j);
            }
        }

        nums[low] = nums[i];
        nums[i] = tmp;

        return i;
    }

    public void swap(int[] nums, int i, int j){
        int t = nums[j];
        nums[j] = nums[i];
        nums[i] = t;
    }

    public static void main(String[] args){
        int[] nums = {5, -2, 1, 0};
        int k = 1;

        System.out.println(new Solution().findKthLargest(nums, k));
    }
}
