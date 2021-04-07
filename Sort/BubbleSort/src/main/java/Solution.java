import java.util.Arrays;

/**
 * @author hongguan.liu
 * Created at: 2021/2/19
 **/
public class Solution {
    public void bubbleSort(int[] arr){
        int temp;
        for(int i=0;i<arr.length-1;i++)
            for(int j=0;j<arr.length-1-i;j++){
                if (arr[j+1] < arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
    }
    public static void main(String[] args){
        int arr[] = {1,6,2,2,5};
        new Solution().bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
