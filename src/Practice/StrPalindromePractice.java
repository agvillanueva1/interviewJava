package Practice;

public class StrPalindromePractice {
    public static void main(String[] args) {

    }

    public static boolean isPalTwo(String str){
        int end = str.length()-1;

        for (int start = 0; start < str.length() /2; start++){
            char sChar = str.charAt(start);
            char eChar = str.charAt(end);
            if(sChar != eChar){
                return false;
            }

            end--;
        }

        return true;
    }
}
