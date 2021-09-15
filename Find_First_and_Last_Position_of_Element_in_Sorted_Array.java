import java.util.ArrayList;
import java.util.Scanner;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i <n ; i++) {
           arr[i]= scn.nextInt();
        }
        int target= scn.nextInt();
       int[] ans= search(arr,target);

        for (int i = 0; i < ans.length ; i++) {
            System.out.println(ans[i]);
        }
    }
    static int [] search(int []arr,int target){
        int[]ans={-1,-1};
         int start=0;
         int end=arr.length-1;
         while (start<=end){
             int mid=(start+end)/2;
             if(target>arr[mid]){
                 start=mid+1;
             }else if(target<arr[mid]) {
                 end=mid-1;
             }else {
                 ans[0]=mid;
                 end=mid-1;
             }
         }
          start=0;
         end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]) {
                end=mid-1;
            }else {
                ans[1]=mid;
                start=mid+1;
            }
        }
return ans;
    }
}
