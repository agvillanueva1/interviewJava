package JavaChallenges;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {

        int x = 300;
        int y = 300;
        int z = 100;

        if (x >y && x >z){
            System.out.println("x is the largest number");
        }else if(y>z){
            System.out.println("y is the largest number");
        }else{
            System.out.println("z is the greatest number");
        }

        // Second Apporaach

        if (x>=y){
            if(x>=z){
                System.out.println("x is the largest");
            }else{
                System.out.println("z is largest");
            }
        }
        else {
            if(y>=z){
                System.out.println("y is the largest");
            }
            else{
                System.out.println("z is the greatest");
            }
        }

    }
}
