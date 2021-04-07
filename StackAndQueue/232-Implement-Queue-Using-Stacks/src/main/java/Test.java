import java.util.Deque;
import java.util.LinkedList;

/**
 * @author hongguan.liu
 * Created at: 2021/3/9
 **/
public class Test {
    public static void main(String[] args){
        Deque<Integer> inStack1 = new LinkedList<>();
        
        inStack1.push(1);
        inStack1.push(2);
        inStack1.push(3);

        System.out.println(inStack1.peek());

        Deque<Integer> inStack2 = new LinkedList<>();

        inStack2.addLast(1);
        inStack2.addLast(2);
        inStack2.addLast(3);

        System.out.println(inStack2.getFirst());
    }
}
