public class infinite_array {
    public static void main(String[] args) {
        

    }
    /*in this case we can not use the length function as it is a infinite array question
    so finding the length we are using the ans() method to determine the length*/
    static int ans(int[]arr,int target){
        int start = 0;
        int end =1;
        while(target>arr[end]){
            int temp = end+1;//this is new start
            //double the box value
            //end = previous_end+sizeofbox*2
            end = end+/*size of box*/(end-start+1)*2;
            start = temp;
        }
        return Binary_search(arr,target,start,end);

    }
    static int Binary_search(int [] arr,int target,int start,int end){
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
}
