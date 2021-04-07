import java.util.LinkedList;
import java.util.List;

/**
 * @author hongguan.liu
 * Created at: 2021/4/7
 **/
public class Solution {
    List<String> res = new LinkedList<>();

    public void backTracking(StringBuilder sb, int startIndex, int pointNum){
        if (pointNum == 3){
            if (isValid(sb, startIndex, sb.length() - 1)){
                res.add(sb.toString());
            }
            return;
        }

        for (int i = startIndex; i < sb.length(); i++){
            if (isValid(sb, startIndex, i)){
                sb.insert(i+1, '.');
                pointNum++;
                backTracking(sb, i+2, pointNum);
                pointNum--;
                sb.deleteCharAt(i+1);
            }else break;
        }
    }

    public boolean isValid(StringBuilder sb, int start, int end){
        if (start > end){
            return false;
        }

        if (sb.charAt(start) == '0' && start != end){
            return false;
        }

        int num = 0;
        for (int i = start; i <= end; i++){
            if (sb.charAt(i) > '9' || sb.charAt(i) < '0'){
                return false;
            }

            num = num * 10 + (sb.charAt(i) - '0');
            if (num > 255){
                return false;
            }
        }
        return true;
    }

    public List<String> restoreIpAddresses(String s) {
        StringBuilder sb = new StringBuilder(s);
        backTracking(sb, 0, 0);
        return res;
    }
}
