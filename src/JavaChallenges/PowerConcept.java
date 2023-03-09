package JavaChallenges;

public class PowerConcept {
    public static void main(String[] args) {
        //2^4 = 16
        int base = 2;
        int exponent = 4;

        long result = 1;

        //0
        while (exponent !=0){
            //result = 8 * 2 = 16
            result = result * base;
            //0
            --exponent;
        }

        System.out.println(result);

        //Can also use the Math function
        //System.out.println(Math.pow(base, exponent));


    }
}
