import java.util.Deque;
import java.util.LinkedList;

/**
 * @author hongguan.liu
 * Created at: 2021/3/9
 **/
public class Solution {
    public String removeDuplicates(String S) {
        StringBuilder ans = new StringBuilder();
        int top = -1;

        for (int i = 0; i < S.length(); i++){
            char curValue = S.charAt(i);
            if (top >= 0 && ans.charAt(top) == curValue){
                ans.deleteCharAt(top);
                top--;
            }else{
                ans.append(curValue);
                top++;
            }
        }
        return ans.toString();
    }

    public void run(){
        System.out.println(this.getClass().getResource(""));
        System.out.println(this.getClass().getResource("/"));
    }

    public static void main(String[] args){
//        String S = "abbaca";
//        System.out.println(new Solution().removeDuplicates(S));
        new Solution().run();
    }
}
