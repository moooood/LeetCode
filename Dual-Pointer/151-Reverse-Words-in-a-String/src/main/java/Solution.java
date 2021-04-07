/**
 * @author hongguan.liu
 * Created at: 2021/3/8
 **/
public class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = trimSpace(s);

        reverse(sb, 0, sb.length() - 1);
        reverseEachWords(sb);

        return sb.toString();
    }

    public StringBuilder trimSpace(String s){
        StringBuilder sb = new StringBuilder();

        int left = 0;
        int right = s.length() - 1;

        while (left < right && s.charAt(left) == ' '){
            left++;
        }
        while (left < right && s.charAt(right) == ' '){
            right--;
        }

        for (int i = left; i <= right; i++){
            char c = s.charAt(i);
            if (c != ' '){
                sb.append(c);
            }else if (sb.charAt(sb.length() - 1) != ' '){
                sb.append(c);
            }
        }

        return sb;
    }

    public void reverse(StringBuilder sb, int left, int right){
        while (left < right){
            char tmp = sb.charAt(left);
            sb.setCharAt(left++, sb.charAt(right));
            sb.setCharAt(right--, tmp);
        }
    }

    public void reverseEachWords(StringBuilder sb) {
        int n = sb.length();
        int start = 0;
        int end = 0;

        while (start < n) {
            while (end < n && sb.charAt(end) != ' ') {
                end++;
            }
            reverse(sb, start, end - 1);

            start = end + 1;
            ++end;
        }
    }

    public static void main(String[] args){
        String s = "the sky is blue";
        System.out.println(new Solution().reverseWords(s));
    }
}
