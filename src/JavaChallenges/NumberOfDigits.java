package JavaChallenges;

public class NumberOfDigits {
    public static void main(String[] args) {

        //1234 = 4

        int num = 01;
        int count =0;

        ///0
        while (num!=0){
            num = num/10;  //123 12  , 1, 0
            count++; //1, 2, 3, 4
        }
        System.out.println(count);



    }
}
