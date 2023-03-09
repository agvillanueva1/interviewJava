package SamsungPrep;

public class CountSumOfDigitsNum {
    public static void main(String[] args) {
        countSumThirdVar(123);
        countSumThirdVar(88888888);

    }

    public static void countSumThirdVar(int num){

        int sum = 0;

        while (num > 0){
            int temp = num % 10;  // gets the rightmost number
            sum = sum + temp;
            num = num /10;  // eliminates rightmost number
        }

        System.out.println(sum);
    }


    // More concise
    public static void countSum(int num){

        int sum = 0;

        while (num > 0){
            sum = sum + num%10;
            num = num/10;
        }

        System.out.println(sum);
    }
}
