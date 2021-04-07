import java.util.Arrays;
import java.util.Comparator;

/**
 * @author hongguan.liu
 * Created at: 2021/2/1
 **/
public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0){
            return 0;
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int n = intervals.length;
        int right = intervals[0][1];
        int ans = 1;
        for (int i = 1; i<n;++i){
            if (intervals[i][0] >= right){
                ++ans;
                right = intervals[i][1];
            }
        }
        return n - ans;
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int prev = -1;
        int m = flowerbed.length;

        for (int i = 0; i < m; i++) {
            if (flowerbed[i] == 1) {
                if (prev < 0) {
                    count += i / 2;
                } else {
                    count += (i - prev - 2) / 2;
                }
                prev = i;
            }
        }

        if (prev < 0) {
            count += (m + 1) / 2;
        } else {
            count += (m - 1 - prev) / 2;
        }

        return count >= n;
    }

    public static void main(String[] args){
//        int[][] intervals = {{1,2}, {2,3}, {3,4}, {1,3}};
//        System.out.println(new Solution().eraseOverlapIntervals(intervals));
        int[] test = {1,0,0,0,1};
        int n = 1;
        System.out.println(new Solution().canPlaceFlowers(test, n));
    }
}
