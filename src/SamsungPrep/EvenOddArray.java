package SamsungPrep;

public class EvenOddArray {
    public static void main(String[] args) {

        // Print only Odd or Even Numbers from the Array

        int a[] = {1,2,3,4,5,6};
        //extractEvenNums(a);
        extractOddNums(a);

    }

    public static void extractEvenNums(int[] array){
        //Print out the even values
        for (int i =0; i < array.length; i ++){
            if(array[i]%2==0){
                System.out.println(array[i]);
            }
        }

    }


    public static void extractOddNums(int[] array) {
        //Print out the even values
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}
