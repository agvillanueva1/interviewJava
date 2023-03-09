package Interface;

public class QTest {
    public static void main(String[] args) {
        int i = 0;
        int j =0;
        for (i = 1; i <=10; i++, j++){
             if(i==5){
                break;
            }
        }
        System.out.println(i+" "+j);
    }
}
