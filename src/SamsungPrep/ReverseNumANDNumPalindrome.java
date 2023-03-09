package SamsungPrep;

public class ReverseNumANDNumPalindrome {
    public static void main(String[] args) {
        System.out.println(revNum(1234));

        System.out.println(isNumPal(1234));
        System.out.println(isNumPal(1));



    }

    // ONLY Reverses a Number
    public static int revNum(int num) {
        // num % 10 -> gets most right number
        // num / 10 -> removes most right number
        // num * 10 + value -> to append the value to number
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;

        }

        return rev;
    }

    //-----------------------------------------
    // True/False Is the Number Palindrome?

    public static boolean isNumPal(int num) {
        int original = num;
        int reverse = 0;

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;

        }

        return original == reverse;
    }
}
