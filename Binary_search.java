public class Binary_search {
    public static void main(String[] args) {
        int [] arr ={2,3,12,13,20,24,25,30,35,40,41,45};
        int target = 45;
        int res = bin_src(arr,target);
        System.out.println(res);
    }
    public static int bin_src(int [] arr,int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if (target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }

        return -1;

    }
    public static int Ceiling(int [] arr, int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return start;
    }
}
