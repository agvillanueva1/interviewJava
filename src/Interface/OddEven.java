package Interface;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = reader.nextInt();

        if(num%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
