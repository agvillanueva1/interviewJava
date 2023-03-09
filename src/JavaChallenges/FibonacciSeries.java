package JavaChallenges;

public class FibonacciSeries {
    public static void main(String[] args) {

        // 0 1 1 2 3 5 6 13 21 24
//
//        int num = 10;
//        int t1 = 0;
//        int t2 = 1;
//
//        for (int i = 1; i <= num; i++){
//            System.out.println(t1);
//            int sum = t1 + t2;
//            t1 = t2;
//            t2 = sum;
//
//        }
//    }

        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        System.out.print(num1 + " " + num2);

        for(int i =2; i <=10; i++)
        {
            sum = num1 + num2;
            System.out.print(" " + sum);
            num1 = num2;
            num2=sum;

        }

        int n =3;

        System.out.println("------------------");
        System.out.println(fiboseq(n));
    }

    public static long fiboseq(int n){
        if (n <= 1) {
        return n;
        }

       return (fiboseq(n-2) + fiboseq(n-1));

    }
}
