import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hongguan.liu
 * Created at: 2021/4/6
 **/
public class Solution {
    //映射
    String[] map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    //结果集
    List<String> result = new LinkedList<>();

    //路径
    StringBuilder sb = new StringBuilder();

    public void backTracking(String digits, int index){
        if (sb.length() == digits.length()){
            result.add(sb.toString());
            return;
        }
        String val = map[digits.charAt(index) - '0'];
        for (char ch:val.toCharArray()){
            sb.append(ch);
            backTracking(digits, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }

    }

    public List<String> letterCombinations(String digits) {
        if (null == digits || digits.length() == 0) return result;
        backTracking(digits, 0);
        return result;
    }



}
