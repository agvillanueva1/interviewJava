package SamsungPrep;

public class MaxArray {
    public static void main(String[] args) {
        // method returns the biggest element from array

        System.out.println(max(new int[] {4, 5, 99, 8, 1, 2})); // 99
        System.out.println(max(new int[] {5, 5, 4, 3, 2})); // 5
        System.out.println(max(new int[] {1, 1, 1})); // 1

    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int element : arr) {
            System.out.println(element);
            if (max < element) {
                max = element;
            }
        }

        return max;
    }
}
