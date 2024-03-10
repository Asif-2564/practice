public class mountain_top {
        public static void main(String[] args) {
            int [] arr={0,1,0};
            int res = top_of_mountain(arr);
            System.out.println(res);

        }
        static int top_of_mountain(int[] arr){
            int start = 0;
            int end = arr.length-1;
            while(start<end){
                int mid = start+(end-start)/2;
                if(arr[mid]>arr[mid+1]){
                    //the value is on the decreasing order
                    end = mid;
        
                }else{
                    //the value is on the increasing order
                    start = mid+1;
                }
            }
            return start;
        
        }
    }
