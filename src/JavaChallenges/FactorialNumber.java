package JavaChallenges;

public class FactorialNumber {
    public static void main(String[] args) {
        //5! = 5x4x3x2x1 = 120

        int num = 5;
        int factorial = 1;

        for (int i = 1; i <=num; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);

    }
}
