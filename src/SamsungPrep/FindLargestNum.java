package SamsungPrep;

public class FindLargestNum {
    //Given three numbers, find largest number
    public static void main(String[] args) {
        System.out.println(returnLargestNum(100,200,300));
        System.out.println(returnLargestNum(500, 300, 100));

        System.out.println(returnLargestNumUsingTernary(6, 2, 9));

    }

    public static int returnLargestNum(int a, int b, int c){

        if (a>b && a>c){
            return a;
        }else if(b>a && b>c){
            return b;
        }else{
            return c;
        }
    }

    public static int returnLargestNumUsingTernary(int a, int b, int c){
        int largest = a > b ? a : b;  // largest of a and b

        largest = c > largest ? c : largest;

        // OR one line int largest = c > (a > b ? a : b) ? c : (a > b ? a : b);

        return largest;
    }
}
