package Interface;

public class SamsungWatch implements Watch {

    @Override
    public void tellTime(){
        System.out.println("digital");
    };

    @Override
    public void watchSize(){
        System.out.println("size is 2");
    };

    @Override
    public void clickBtn(){
        System.out.println("N o buttons on my watch!");
    };

    public void glowDark(){
        System.out.println("I glow!");


    }
}
