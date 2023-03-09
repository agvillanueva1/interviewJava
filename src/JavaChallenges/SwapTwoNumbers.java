package JavaChallenges;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        int a = 10;  //20
        int b = 20; // 10

        // With temp variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping:");
        System.out.println("a="+ a);
        System.out.println("b="+b);

        //Without creating a temp variable
        a = a + b; //30
        b = a - b; // 10
        a = a - b;

        System.out.println(a);
        System.out.println(b);




    }
}
