/**
 * @author hongguan.liu
 * Created at: 2021/2/19
 **/
public class Solution {

    public void quickSort(int[] arr, int low, int high){
        int i, j, temp, t;

        if(low > high) return;

        i = low;
        j = high;

        temp = arr[low];

        while(i < j){
            while (arr[j] >= temp && i < j){
                j--;
            }
            while (arr[i] <= temp && i < j){
                i++;
            }
            if(i<j){
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;

        quickSort(arr, low, j-1);
        quickSort(arr, j+1, high);
    }

    public static void main(String[] args){
        int[] arr = {10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19};
        new Solution().quickSort(arr, 0, arr.length -1);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
