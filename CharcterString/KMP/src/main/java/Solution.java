/**
 * @author hongguan.liu
 * Created at: 2021/3/8
 **/
public class Solution {

    public void getNext(int[] next, String s){
        int j = -1;
        next[0] = j;

        for (int i = 1; i < s.length(); i++){
            while (j >= 0 & s.charAt(i) != s.charAt(j+1)){
                j = next[j];
            }

            if (s.charAt(i) == s.charAt(j+1)){
                j++;
            }
            next[i] = j;
        }
    }

    public int strStr(String haystack, String needle){
        if (needle.length() == 0){
            return 0;
        }

        int[] next = new int[needle.length()];
        getNext(next, needle);
        int j = -1;
        for (int i = 0; i < haystack.length(); i++){
            while (j>=0 && haystack.charAt(i) != needle.charAt(j+1)){
                j = next[j];
            }
            if (haystack.charAt(i) == needle.charAt(j+1)){
                j++;
            }
            if (j == (needle.length() - 1)){
                return (i - needle.length() + 1);
            }
        }
        return -1;
    }

    public int search(String pat, String txt){
        int j, M = pat.length();
        int i, N = txt.length();
        for (i = 0, j = 0; i < N && j < M; i++){
            if (txt.charAt(i) == pat.charAt(j)) j++;
            else { i-= j; j = 0;}
        }
        if (j == M) return i - M;
        else return N;
    }

    public static void main(String[] args){
        String s = "ababcab";
        String p = "abc";

        System.out.println(new Solution().strStr(s, p));
    }
}
