/**
 * @author hongguan.liu
 * Created at: 2021/3/4
 **/
public class Solution {
    public String replaceSpace(String s) {
        int length = s.length();
        char[] array = new char[3*length];
        int size = 0;

        for (int i = 0; i < length; i++){
            char c = s.charAt(i);
            if (c == ' '){
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            }else{
                array[size++] = c;
            }
        }

        return new String(array, 0, size);
    }
}
