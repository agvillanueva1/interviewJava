package Practice;

public class ReverseNumber {
    public static void main(String[] args) {

        int num =1234;
        int rev = 0;

        while (num!=0){
            rev=rev*10 + num%10;  //0*10  + 1234/10
            num =num/10;
        }

        System.out.println(rev);
        System.out.println("-------------");

        System.out.println(isNumPal(121)); // true
        System.out.println(isNumPal(123)); // false
        System.out.println(isNumPal(12344321)); // true
    }

    public static boolean isNumPal(int num){
        int original = num;
        int reverse = 0;

        while (num!=0){
            reverse = reverse * 10 + num % 10;
            num = num / 10;

        }

        return original == reverse;
    }
}
