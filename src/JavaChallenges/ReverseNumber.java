package JavaChallenges;

public class ReverseNumber {
    public static void main(String[] args) {

        int num = 1234; // 4321
        int rev = 0;


        //1234
        while(num!=0) {
            int n = num % 10; // 4
            rev = rev * 10 + n;  //4
            num = num/10; //123
        }

        System.out.println(rev);
    }
}
