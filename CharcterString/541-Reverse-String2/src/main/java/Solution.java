import java.util.*;

/**
 * @author hongguan.liu
 * Created at: 2021/3/4
 **/
public class Solution {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for (int start = 0; start < a.length; start += 2*k){
            int left = start;
            int right = Math.min(start + k - 1, a.length - 1);
            while (left < right){
                swap(a, left, right);
                left++;
                right--;
            }
        }
        return new String(a);
    }

    public void swap(char[] s, int start, int end){
        char tmp = s[start];
        s[start] = s[end];
        s[end] = tmp;
    }

}
