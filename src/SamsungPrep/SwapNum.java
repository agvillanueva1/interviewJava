package SamsungPrep;

import java.sql.Wrapper;

public class SwapNum {

    public static void main(String[] args) {

        int a = 15;
        int b = 5;

        swapWithPlusMinus(a,b);
        swapWithThirdVar(a, b);
        swapWithMultDivide(a, b);
        swapWithCarat(a, b);

    }

    public static void swapWithPlusMinus(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a=" + a + " b=" + b);

    }

    public static void swapWithThirdVar(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a=" + a + " b=" + b);

    }

    public static void swapWithMultDivide(int a, int b){
        // Works as long as a & b values are NOT zero
        a = a * b;
        b = a / b;
        a = a /b;

        System.out.println("a=" + a + " b=" + b);
    }

    public static void swapWithCarat(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a=" + a + " b=" + b);

    }
}
