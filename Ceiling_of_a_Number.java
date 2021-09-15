import java.util.Scanner;
//q find the closetst grater number of target
public class Ceiling_of_a_Number {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int []arr={2,3,5,9,14,16,18};
        int target=4;
        System.out.println(Search(arr,target));
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
