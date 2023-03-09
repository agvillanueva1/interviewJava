package SamsungPrep;

public class MinSwapCountToOrderArray {
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 1}; //2

        //Use Selection Sort --
        // Take the first index as lowest value
        // iterate through a for loop to see which value to the right is the lowest
        // Grab that index
        // Then switch
        // Add to counter


        MinSwapCountToOrderArray sample = new MinSwapCountToOrderArray();
        System.out.println(sample.countNumSwap(arr));

        //System.out.println(countNumSwap(arr)); Use this if the method was static like public static int countNumSwap(int[] array)

    }

    public int countNumSwap(int[] array) {

        int countSwap = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {  // if true, then new min value is j at its index
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;

                ++countSwap;

            }
        }

        return countSwap;

    }
}
