package Interface;

public class MethodOverloading {

    void add(int a, int b){
        System.out.println(a+b);
    }


    void add(int a, double b){
        System.out.println(a+b);
    }

    void add(double a, double b){
        System.out.println(a+b);
    }

    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }




    public static void main(String[] args) {

        MethodOverloading mo = new MethodOverloading();
        mo.add(10,20);

    }
}
