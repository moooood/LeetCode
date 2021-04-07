/**
 * @author hongguan.liu
 * Created at: 2021/3/5
 **/
public class Solution {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        reverse(sb, 0, sb.length()-1);
        reverse(sb, 0, sb.length()- 1 - n);
        reverse(sb, sb.length() - n, sb.length()-1);

        return sb.toString();
    }

    public void reverse(StringBuilder sb, int left, int right){
        while (left < right){
            char tmp = sb.charAt(left);
            sb.setCharAt(left++, sb.charAt(right));
            sb.setCharAt(right--, tmp);
        }
    }

    public static void main(String[] args){
        String s = "abcdef";
        s.substring(0, 1);
    }
}
