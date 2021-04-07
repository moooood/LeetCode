/**
 * @author hongguan.liu
 * Created at: 2021/2/23
 **/
public class Solution {

    public static void mergeSort(int[] arr, int low, int high, int[] tmp){
        if(low < high){
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid, tmp);
            mergeSort(arr, mid+1, high, tmp);
            merge(arr, low, mid, high, tmp);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high, int[] tmp){
        int i = 0;
        int j = low, k = mid + 1;
        while(j <= mid && k <=high){
            if (arr[j] < arr[k]){
                tmp[i++] = arr[j++];
            }else{
                tmp[i++] = arr[k++];
            }
        }

        while(j <= mid){
            tmp[i++] = arr[j++];
        }

        while(k <= high){
            tmp[i++] = arr[k++];
        }

        for(int t = 0; t<i; t++){
            arr[low+t] = tmp[t];
        }
    }

    public static void main(String[] args){
        int[] arr = {11,44,23,67,88,65,34,48,9,12};
        int[] tmp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, tmp);
    }
}
