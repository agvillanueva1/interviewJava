package SamsungPrep;

public class SumOfNumArray {

    public static void main(String[] args) {

        int a[] = {5,2,7,9,6};

        System.out.println(sumNumArray(a));



    }

    public static int sumNumArray(int[] numArr){
        int sum = 0;

        for (int i =0; i <= numArr.length -1; i++ ){
            sum = sum + numArr[i];
        }

        return sum;
    }

    //Enchanced for loop
    /*for(int value : numArr){
        sum = sum + value}*/
}
