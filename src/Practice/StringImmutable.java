package Practice;

public class StringImmutable {

    public static void main(String[] args) {

        //String literals stored in the String Constant Pool (SCP) - Heap Memory
        String x = "abc";
        String y = "abc";
        x.concat(y); //abcabc
        System.out.println(x);// abc


        // String Constant Pool (SCP)

    }
}
