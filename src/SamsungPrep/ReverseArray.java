package SamsungPrep;

import java.util.Arrays;

public class ReverseArray {

        public static void main(String[] args) {

            int arr[] = {10, 20, 30, 40, 50};

            int n=arr.length;
            int start = 0, end = n-1;

            while(start<end){
                int temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }

            for(int i=0; i<n; i++)
                System.out.print(arr[i]+" ");

            System.out.println("-------------------------OR----METHOD 2:-----------------------");

            int[] inputArray = {7, 2, 5, 6};
            System.out.println(Arrays.toString(inputArray)); // [7, 2, 5, 6]
            revArray(inputArray);
            System.out.println(Arrays.toString(inputArray)); // [6, 5, 2, 7]

            // 1. I will be using two pointers one for the end and one for start of the array
            // 2. Then I will iterate over the half of the array and keep swapping end with start
        }

        public static void revArray(int[] arr) {

            int end = arr.length - 1;

            for (int i = 0; i < arr.length / 2; i++) {
                int tmp = arr[i];
                arr[i] = arr[end];
                arr[end] = tmp;
                end--;
            }
        }

}
