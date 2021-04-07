/**
 * @author hongguan.liu
 * Created at: 2021/2/1
 **/
public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int m = flowerbed.length;
        int prev = -1;
        for (int i =0; i<m; i++){
            if (flowerbed[i] == 1){
                if (prev < 0) {
                    count += i / 2;
                } else {
                    count += (i - prev - 2) / 2;
                }
                prev = i;
            }
        }

        if (prev < 0){
            count += (m+1)/2;
        } else{
            count += (m - prev -1)/2;
        }
        return count >= n;
    }

    public static void main(String[] args){
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        System.out.println(new Solution().canPlaceFlowers(flowerbed, n));
    }
}
