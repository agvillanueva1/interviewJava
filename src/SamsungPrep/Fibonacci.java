package SamsungPrep;

public class Fibonacci {
    public static void main(String[] args) {
        //0 1    1 2 3 5 8 13 21 34

        int n1 = 0, n2=1, sum =0;

        System.out.print(n1 + " " + n2); // Print out the first two numbers of the series 0 1

        for (int i =2; i<10; i++){
            sum = n1 + n2; // 1
            System.out.print(" "+sum); // Print out the sum for the fibonacci series
            n1 = n2;  // Store n2 into n1
            n2 = sum; // Store sum into n2
        }

    }
}
