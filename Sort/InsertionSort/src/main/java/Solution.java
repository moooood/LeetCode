import java.util.Arrays;

/**
 * @author hongguan.liu
 * Created at: 2021/2/19
 **/
public class Solution {

    public void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int j = i;
            while(j > 0){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
                }else break;
            }
        }
    }

    public void shellSort(int[] arr){
        for (int step = arr.length/2; step>0;step/=2){
            for(int i = step; i < arr.length; i++){
                int value = arr[i];
                int j;
                for (j = i-step; j>=0 && arr[j] > value; j-=step){
                    arr[j + step] = arr[j];
                }
                arr[j + step] = value;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {4, 3, -1, 2, 1, 0};
//        new Solution().insertionSort(arr);
        new Solution().shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
