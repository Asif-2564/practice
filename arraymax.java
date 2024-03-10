import java.util.*;
public class arraymax {
    public static int max_val(int [] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void swap(int[]arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public static void reverse(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;

        }
    }

    public static void main(String[] args) {
        int [] arr={12,34,43,-10,98};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

}
