package Practice;

public class SwapTwoIntegers {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        // Goal x = 10; y=5;

        // 1. First Approach - Without using a third variable, swap so that x=10 and y=5;
//
//        x = x + y; //x=15
//        y = x - y; // y=5
//        x = x - y; // x=10
//
//        System.out.println("After swap " + "x=" + x);
//        System.out.println("After swap " + "y=" + y);

        // 2. Second Approach - Using a third variable

        int t;
        t = x;// t=5
        x = y; // x = 10;
        y = t; // 10

        System.out.println("After swap " + "x=" + x);
        System.out.println("After swap " + "y=" + y);

        // 3. Using * and /
        x = x * y;
        y = x / y;
        x = x / y;

        System.out.println(x);
        System.out.println(y);






    }
}
