import java.util.Arrays;

/**
 * @author hongguan.liu
 * Created at: 2021/2/23
 **/
public class Solution {

    public static void selectionSort(int[] arr){
        for(int i  = 0; i<arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;
            if (i != min){
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
    }
    public static void heapSort(int[] arr){
        for (int i = arr.length/2 -1; i>=0; i--)
            adjustHeap(arr, i, arr.length);
        for (int j = arr.length-1; j > 0; j--){
            int tmp = arr[0];
            arr[0] = arr[j];
            arr[j] = tmp;
            adjustHeap(arr, 0, j);
        }
    }
    public static void adjustHeap(int[] arr, int i, int length){
        int tmp = arr[i];
        for(int k=i*2+1; k<length; k=k*2 + 1){
            if(k+1<length && arr[k] < arr[k+1]){
                k++;
            }
            if(arr[k] > tmp){
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        arr[i] = tmp;
    }

    public static void main(String[] args){
        int[] arr = {4,2,0,1,-2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
