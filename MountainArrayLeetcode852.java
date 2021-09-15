import java.util.Scanner;

public class MountainArrayLeetcode852 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int []arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=scn.nextInt();
        }
        System.out.println(search(arr));

    }
    static int search(int [] nums){
        int start=0;
        int end=nums.length-1;

        while (start<end){

          int mid=(start+end)/2;

          if (nums[mid]>nums[mid+1]){
              end=mid;

          }else {
              start=mid+1;
          }
        }
        return start;
    }
}
