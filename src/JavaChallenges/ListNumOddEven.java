package JavaChallenges;

public class ListNumOddEven {

    //https://www.javatpoint.com/java-program-to-display-odd-numbers-from-1-to-100
    public static void main(String[] args) {
        int num = 100;

        for (int i = 1; i <= num; i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }
    }
}
