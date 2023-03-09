package NFCUInterview;

public class PlusOperators {

    public static void main(String[] args) {

    int num1 = 1;
    int num2 = 1;

    if(++num1 <= ++num2) {    //Even if we do pre-increment?
        System.out.println("Hello");
    }else{
        System.out.println("World");
    }

    }
}
