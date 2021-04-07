import java.util.HashSet;
import java.util.Set;

/**
 * @author hongguan.liu
 * Created at: 2021/3/3
 **/
public class Solution {
    int getSum(int n){
        int sum = 0;
        while (n != 0){
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        Set<Integer> record = new HashSet<>();

        while(true){
            int sum = getSum(n);
            if(sum == 1)
                return true;

            if(record.contains(sum)) {
                return false;
            }
            else{
                record.add(sum);
            }
            n = sum;
        }
    }

    public static void main(String[] args){
        int n = 2;
        System.out.println(new Solution().isHappy(2));
    }
}
