import java.util.Scanner;

public class position_of_Element_In_infinite_Array {
    public static void main(String[] args) {
        int []arr={3,5,6,7,9,22,34};
        int target=22;
        System.out.println(binarySearch(arr,target));
    }

    static int binarySearch(int[] arr, int target ) {
        int start = 0;
        int end = 1;


        while (target > arr[end]) {
        int temp=end+1;
            end=end+(end-start+1)*2;
start=temp;
        }
        while(start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {

                return mid;
            }
        }
        return -1;
    }
}