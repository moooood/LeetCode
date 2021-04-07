/**
 * @author hongguan.liu
 * Created at: 2021/3/8
 **/
public class Solution {
    public void getNext(int[] next, String s){
        int j = -1;
        next[0] = j;
        for(int i = 1; i < s.length(); i++){
            while (j >= 0 && s.charAt(i) != s.charAt(j+1)){
                j = next[j];
            }
            if (s.charAt(i) == s.charAt(j+1)){
                j++;
            }
            next[i] = j;
        }
    }

    public boolean repeatedSubstringPattern(String s) {
        if (s.length()  == 0){
            return false;
        }
        int[] next = new int[s.length()];
        getNext(next, s);
        int len = s.length();
        if (next[len-1] != -1 && len % (len - (next[len-1]+1)) == 0){
            return true;
        }
        return false;
    }

}
