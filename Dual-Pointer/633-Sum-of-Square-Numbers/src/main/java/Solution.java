/**
 * @author hongguan.liu
 * Created at: 2021/2/18
 **/
public class Solution {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++){
            int b = c - (int)(a * a);
            if (binarySearch(0, b, b))
                return true;
        }
        return false;
    }

    public boolean binarySearch(long s, long e, int n){
        if (s > e)
            return false;
        long mid  = s + (e - s) / 2;
        if (n < mid * mid)
            return binarySearch(s, mid - 1, n);
        else if (n > mid * mid)
            return binarySearch(mid + 1, e, n);
        else
            return true;
    }

    public static void main(String[] args){
        int c = 3;
        System.out.println(new Solution().judgeSquareSum(c));
    }
}
