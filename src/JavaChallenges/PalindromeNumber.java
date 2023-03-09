package JavaChallenges;

public class PalindromeNumber {
    public static void main(String[] args) {

        int num = 121;
        int rev = 0;

        int actualNum = num;

        while(num!=0){
            int n = num%10; //gets the rightmost number 1
            rev = rev * 10 + n; // append it    1
            num = num /10;
        }

        System.out.println(rev);

        if(rev == actualNum){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
