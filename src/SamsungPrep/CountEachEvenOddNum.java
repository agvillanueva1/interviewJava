package SamsungPrep;

public class CountEachEvenOddNum {
    public static void main(String[] args) {

        countEvenOdd(1234);

    }

    public static void countEvenOdd(int num){

        int evenCounter = 0;
        int oddCounter = 0;

        while(num>0){
            int rightmostNum = num%10;

            if(rightmostNum%2==0){
                evenCounter++;
            }
                oddCounter++;

            num = num / 10;  //removes rightmostNum
        }

        System.out.println("even:" + evenCounter + " odd:" + oddCounter);
    }
}
