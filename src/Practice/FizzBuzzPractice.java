package Practice;

public class FizzBuzzPractice {
    public static void main(String[] args) {
        // Create a program that prints numbers from 1 to 100
        // - if number is divisible by 3, print Fizz
        // - if number is divisible by 5, print Buzz
        // - if number is divisible by 3 and 5, print FizzBuzz

        for (int i = 1; i <=100; i++){  // Modulus Operator, whatever is on the left, divide it on the right side as many times as you can, then give me the result
                                        // Trying to evenly divide and return whatever is left. If no remainder (0), that number is divisible by x
            if( i % 3 == 0 && i % 5==0){
                System.out.println("FizzBuzz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }

        }

    }
}
