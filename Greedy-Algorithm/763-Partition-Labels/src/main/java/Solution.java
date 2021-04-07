import java.util.ArrayList;
import java.util.List;

/**
 * @author hongguan.liu
 * Created at: 2021/2/3
 **/
public class Solution {

    public List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        int length = S.length();
        for (int i=0; i<length; i++){
            last[S.charAt(i) - 'a'] = i;
        }

        List<Integer> partition = new ArrayList<>();
        int start = 0, end = 0;
        for (int i=0; i<length; i++){
            end = Math.max(end, last[S.charAt(i) - 'a']);
            if (i == end){
                partition.add(end - start + 1);
                start = end + 1;
            }
        }
        return partition;
    }

    public static void main(String[] args){
        String S = "iloveweimob";
        System.out.println(new Solution().partitionLabels(S));
    }
}
