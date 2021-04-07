import java.util.Deque;
import java.util.LinkedList;

/**
 * @author hongguan.liu
 * Created at: 2021/3/9
 **/
public class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++){
            char curValue = s.charAt(i);

            if (stack.isEmpty()){
                stack.push(curValue);
                continue;
            }

            char topValue = stack.peek();
            if (topValue == '(' && curValue == ')' || topValue == '{' && curValue == '}' || topValue == '[' && curValue == ']'){
                stack.pop();
            }else{
                stack.push(curValue);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        String s = "()";
        System.out.println(new Solution().isValid(s));
    }
}
