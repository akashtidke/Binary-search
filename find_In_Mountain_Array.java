public class find_In_Mountain_Array {
    public static void main(String[] args) {
int []arr={1,4,5,2,1};
        int ans=peakElement(arr);
        System.out.println(ans);
    }
    static int peakElement(int[] arr){
        int start=0;
        int end= arr.length-1;
        while (start<end){
            int mid=(start+end)/2;
            if (arr[mid]>arr[mid+1]){
                end=mid;
            }else {
                start=mid+1;
            }
        }
        return start;
    }
    static int Search(int []arr,int target){
        if (target>arr[arr.length-1]){
            return -1;
        }



        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;

            if (target>arr[mid]){
                start=mid+1;

            } else if (target<arr[mid]){
                end=mid-1;
            }else {
                return arr[mid];

            }


        }
        return arr[start];
    }
}

