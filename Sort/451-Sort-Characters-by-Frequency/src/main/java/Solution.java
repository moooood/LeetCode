import org.w3c.dom.Element;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author hongguan.liu
 * Created at: 2021/2/24
 **/
public class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> occurrences = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            Character key = s.charAt(i);
            occurrences.put(key, occurrences.getOrDefault(key, 0) + 1);
        }

        PriorityQueue<Element> queue = new PriorityQueue<>((o1, o2) -> o2.value - o1.value);
        for (Map.Entry<Character, Integer> entry: occurrences.entrySet()){
            queue.add(new Element(entry.getKey(), entry.getValue()));
        }
        String ans = "";
        while (queue.size() > 0){
            Element element = queue.poll();
            for(int i = 0; i < element.value; i++){
                ans += element.c;
            }
        }
        return ans;
    }

    class Element{
        char c;
        int value;

        public Element(char c, int value){
            this.c = c;
            this.value = value;
        }
    }

    public static void main(String[] args){
        String s = "tree";
        System.out.println(new Solution().frequencySort(s));
    }
}
