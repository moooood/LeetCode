import java.util.Arrays;

/**
 * @author hongguan.liu
 * Created at: 2021/3/3
 **/
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] record = new int[26];

        for (int i = 0; i < s.length(); i++){
            record[s.charAt(i) - 'a']++;
        }

        for (int j = 0; j < t.length(); j++){
            record[t.charAt(j) - 'a']--;
            if (record[t.charAt(j) - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}
