package Practice;

public class Random {
    public static void main(String[] args) {
        System.out.println(isPal("tacocat"));
        System.out.println(isPal("baba"));
        System.out.println(isPal("anna"));

    }

   public static boolean isPal(String str){
        int end = str.length()-1;

        for(int start = 0; start < str.length()/2; start++){
            char sChar = str.charAt(start);
            char eChar = str.charAt(end);
            if (sChar != eChar){
                return false;
            }

            end--;
        }

        return true;
   }
}
