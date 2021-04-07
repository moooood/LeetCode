import java.util.Deque;
import java.util.LinkedList;

/**
 * @author hongguan.liu
 * Created at: 2021/3/9
 **/
public class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();

        for (String curValue : tokens) {
            if (curValue.equals("+") || curValue.equals("-") || curValue.equals("*") || curValue.equals("/")) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                if (curValue.equals("+")) {
                    stack.push(num1 + num2);
                }
                if (curValue.equals("-")) {
                    stack.push(num1 - num2);
                }
                if (curValue.equals("*")) {
                    stack.push(num1 * num2);
                }
                if (curValue.equals("/")) {
                    stack.push(num1 / num2);
                }
            } else {
                stack.push(Integer.parseInt(curValue));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args){
        String[] tokens = {"4", "13", "5", "/", "+"};
        System.out.println(new Solution().evalRPN(tokens));
    }
}
