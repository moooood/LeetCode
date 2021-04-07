import java.util.LinkedList;
import java.util.List;

/**
 * @author hongguan.liu
 * Created at: 2021/4/7
 **/
public class Solution {
    List<List<String>> res = new LinkedList<>();
    List<String> path = new LinkedList<>();

    public boolean isPalindrome(String s, int start, int end){
        for (int i = start, j = end; i < j; i++, j--){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public void backTracking(String s, int startIndex){
        if (startIndex >= s.length()){
            res.add(new LinkedList<>(path));
            return;
        }
        for (int i = startIndex; i < s.length(); i++){
            if (isPalindrome(s, startIndex, i)){
                String str = s.substring(startIndex, i + 1);
                path.add(str);
            }else{
                continue;
            }
            backTracking(s, i+1);
            path.remove(path.size() - 1);
        }
    }

    public List<List<String>> partition(String s) {
        backTracking(s, 0);
        return res;
    }
}
