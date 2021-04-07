/**
 * @author hongguan.liu
 * Created at: 2021/3/2
 **/
public class Solution {
    public int[][] generateMatrix(int n) {
        int loop = n / 2;
        int startX = 0;
        int startY = 0;
        int count = 1;
        int mid = n/2;

        int[][] ans = new int[n][n];
        int offset = 1;
        while (loop-- != 0){
            int i = startX;
            int j = startY;

            //所有区间都遵循左闭右开的原则

            //上行
            for (; j < startY + n - offset; j++){
                ans[i][j] = count++;
            }

            //右列
            for(; i < startX + n - offset; i++){
                ans[i][j] = count++;
            }

            //下行
            for(; j > startY; j--){
                ans[i][j] = count++;
            }

            //左列
            for(; i > startX; i--){
                ans[i][j] = count++;
            }

            startX++;
            startY++;
            offset += 2;
        }

        if (n%2 != 0){
            ans[mid][mid] = n*n;
        }

        return ans;
    }
}
