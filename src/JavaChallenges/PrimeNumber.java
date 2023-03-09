package JavaChallenges;

public class PrimeNumber {
    public static void main(String[] args) {

        // Prime Numbers only has 2 factors 1 and itself like 1 and 19 are Prime Numbers
        // Natural Number > 1


        int num = 1;
        boolean flag = false;

        for(int i =2; i <num/2; i++){

            if(num % i ==0){
                flag = true;
                break;
            }
        }

        if(!flag){
            System.out.println(num + " is a prime number");
        }else {
            System.out.println(num + " is not a prime number");
        }



    }
}
