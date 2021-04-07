/**
 * @author hongguan.liu
 * Created at: 2021/3/8
 **/
public class Solution {
    public String replaceSpace(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == ' '){
                ans.append('%');
                ans.append('2');
                ans.append('0');
            }else{
                ans.append(c);
            }
        }

        return ans.toString();
    }
}
