import java.util.Arrays;

/**
 * @author hongguan.liu
 * Created at: 2021/2/1
 **/
public class Solution {

    public int findContentChildren(int[] g, int[] s){
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;

        while(i<g.length && j<s.length){
            if(g[i] <= s[j]){
                i++;
            }
            j++;
        }
        return i;
    }

    public static void main(String[] args){
        int[] g = {1,2};
        int[] s = {1,2,3};
        System.out.println(new Solution().findContentChildren(g, s));
    }
}
