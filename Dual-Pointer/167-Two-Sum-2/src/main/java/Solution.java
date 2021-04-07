import java.util.Arrays;

/**
 * @author hongguan.liu
 * Created at: 2021/2/4
 **/
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1, sum;
        while(l < r){
            sum = numbers[l] + numbers[r];
            if (sum == target) return new int[] {l+1, r+1};
            if (sum < target) l++;
            else
                r--;
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args){
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(new Solution().twoSum(numbers, target)));
    }
}
