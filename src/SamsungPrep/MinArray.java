package SamsungPrep;

public class MinArray {
    public static void main(String[] args) {
        // method returns the biggest element from array

        System.out.println(min(new int[] {4, 5, 99, 8, 0, 2})); // 0
        System.out.println(min(new int[] {5, 5, 4, 3, 2})); // 2
        System.out.println(min(new int[] {1, 1, 1})); // 1

    }

    public static int min(int[] arr) {
        int min = arr[0];
        //Checking min from the array, assuming the first value is the min, that's why we have index 0 here
        // Then I am starting one because it doesn't make sense to compare 4 with 4
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }
}
