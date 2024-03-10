public class question_binary_src {
    public static void main(String[] args) {
        //sorted array of infinite array
    }
    static int Binary_search(int [] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(start-end)/2;
            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
     //sorted array of infinite array
    static int Infinite_arr_src(int [] arr, int target){
        return 0;
    }
}
