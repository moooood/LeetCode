import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author hongguan.liu
 * Created at: 2021/2/1
 **/
public class Solution {
//    public int findMinArrowShots(int[][] points) {
//        if (points.length == 0){
//            return 0;
//        }
//
//        //这边sort里边如果返回的是两个数相减的话，有可能会出现越界
//        Arrays.sort(points, (p1, p2) -> p1[1] < p2[1] ? -1 : 1);
//
//        int pos = points[0][1];
//        int ans = 1;
//        for(int i =1; i<points.length; i++){
//            if (points[i][0] > pos){
//                pos = points[i][1];
//                ++ans;
//            }
//        }
//        return ans;
//    }

    public int findMinArrowShots(int[][] points) {
        if(points.length == 0)
            return 0;

        Arrays.sort(points, (p1, p2)->p1[1]<p2[1]?-1:1);

        int prev = points[0][1];
        int ret = points.length;

        for(int i=1; i<points.length; i++){
            if(points[i][0] > prev){
                prev = points[i][1];
            }else{
                ret--;
            }
        }
        return ret;
    }

    public static void main(String[] args){
        int[][] points = {{1,2},{2,3},{3,4},{4,5}};
        System.out.println(new Solution().findMinArrowShots(points));
    }
}
