package Practice;

import java.util.Random;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] numbers = new int[5];

        for (int i =0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(20);
        }

        System.out.println("Before:");
        printArray(numbers);



        boolean swapped = true;

        while(swapped) {
            swapped = false;

            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swapped = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }




//
//      One Method:
//        boolean swappedCount = true;
//
//        while(swappedCount) {
//
//            swappedCount = false;
//
//            for (int i = 0; i < numbers.length - 1; i++) {
//                if (numbers[i] > numbers[i + 1]) {
//                    swappedCount = true;
//                    int temp = numbers[i];
//                    numbers[i] = numbers[i + 1];
//                    numbers[i + 1] = temp;
//                }
//            }
//        }
/*
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = 0; j < numbers.length-1; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;


                }

            }
        }*/


        System.out.println("\nAfter:");
        printArray(numbers);
    }



    private static void printArray(int[] numbers){
        for(int i =0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
