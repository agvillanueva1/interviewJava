package SamsungPrep;

public class CountEachDigitInNum {

    public static void main(String[] args) {

        System.out.println(countNumofDigits(123456)); // 6
        System.out.println(countNumofDigits(835));  //3
        System.out.println(countNumofDigits(4));  //3

    }

    public static int countNumofDigits(int num){

        int count = 0;

        while (num > 0){
            num = num / 10;  //The value of num is equal to num / 10 which eliminates the last digit
            count++;  // As soon as we do this, increase the count
        }

        return count;
    }


}
