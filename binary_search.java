public class binary_search {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,77,87};
        int  target=77;
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=(start+end)/2;
            if(target<arr[mid]){
                end=mid-1;
            }if (target>arr[mid]){
                start=mid+1;
            }else {
                System.out.println(mid);
            }
        }
    }
}
