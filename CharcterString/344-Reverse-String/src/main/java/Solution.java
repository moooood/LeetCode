import java.util.Arrays;

/**
 * @author hongguan.liu
 * Created at: 2021/3/4
 **/
public class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;

        while (left < right){
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }

    public static void main(String[] args){
        char[] s = new char[] {'s', 'a', 'c'};
        new Solution().reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
