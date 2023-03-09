package SamsungPrep;

public class ReverseStringANDStrPalindrome {

    public static void main(String[] args) {

        System.out.println(revStrUsingConcatentation("ABCDE"));
        System.out.println(revStrUsingCharacterArray("PURPLE"));
        revStrUsingStringBuffer("ORANGE");
        //---
        System.out.println(isPal("ANNA"));  //true
        System.out.println(isPal("a"));  // true

    }

    //-------------------------------------------------------------------
    // METHODS TO REVERSE STRING ONLY
    public static String revStrUsingConcatentation(String str){
        // Using + string concatenation operator
        String rev = "";

        for (int i = str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }

    public static String revStrUsingCharacterArray(String str){
        // Using character array
        char a[] = str.toCharArray();
        String rev = "";

        for (int i =str.length()-1; i >=0; i--){
            rev = rev + a[i];
        }
        return rev;
    }

    public static void revStrUsingStringBuffer(String str) {
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }


    //-------------------------------------------------------------------
    // METHODS TO CHECK IS PALINDROME? Pavan
    public static boolean isPal(String str) {
        String rev = "";
        String originalStr = str;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (originalStr.equals(rev)) {
            return true;
        }
        return false;
    }

    // Check Palindrom Using Swap Over Half the Length - Bek
    public static boolean isPalUsingSwap(String str) {
        int end = str.length() - 1;
        for (int start = 0; start < str.length() / 2; start++) {
            char sChar = str.charAt(start);
            char eChar = str.charAt(end);
            if (sChar != eChar) {
                return false;
            }
            end--;
        }
        return true;
    }


}


