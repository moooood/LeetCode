/**
 * @author hongguan.liu
 * Created at: 2021/3/3
 **/
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;

        int[] record = new int[26];

        for (int i = 0; i < magazine.length(); i++){
            record[magazine.charAt(i) - 'a']++;
        }

        for (int j = 0; j < ransomNote.length(); j++){
            record[ransomNote.charAt(j) - 'a']--;
            if (record[ransomNote.charAt(j) - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}
