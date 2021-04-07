import java.util.ArrayList;
import java.util.List;

/**
 * @author hongguan.liu
 * Created at: 2021/2/18
 **/
public class Solution {
    public boolean isSubsequence(String x, String y){
        int j = 0;
        for (int i = 0; i < y.length() && j < x.length(); i++)
            if (x.charAt(j) == y.charAt(i))
                j++;
        return j == x.length();
    }


    public String findLongestWord(String s, List<String> d) {
        String maxStr = "";
        for (String str: d){
            if (isSubsequence(str, s)){
                if (str.length() > maxStr.length() || (str.length() == maxStr.length() && str.compareTo(maxStr)<0))
                    maxStr = str;
            }
        }
        return maxStr;
    }

    public static void main(String[] args){
        String s = "abpcplea";
        List<String> d = new ArrayList<>();
        d.add("ale");
        d.add("apple");
        d.add("monkey");
        d.add("plea");
        System.out.println(new Solution().findLongestWord(s, d));
    }
}
