package Interface;

public class ConstructorOverloading {

    ConstructorOverloading(int a, int b){
        System.out.println(a+b);
    }

    ConstructorOverloading(int a, double b){
        System.out.println(a+b);
    }

    ConstructorOverloading(double a, int b){
        System.out.println(a+b);
    }

    ConstructorOverloading(double a, int b, int c){
        System.out.println(a+b+c);
    }


    public static void main(String[] args) {
        //Don't need to create an object to call constructor xplciity

        ConstructorOverloading co = new ConstructorOverloading(10,20);



    }
}
