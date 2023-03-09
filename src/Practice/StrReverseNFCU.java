package Practice;

public class StrReverseNFCU {

    String str = "December is the last month of the year";
    //public static String str = "December is the last month of the year";


    public static void main(String[] args) {

        StrReverseNFCU word = new StrReverseNFCU();
        System.out.println(revWords(word.str));
        System.out.println(revWords("PURPLE"));



        //System.out.println(revWords(ReverseStrDELETE.str));

    }


//    public static String revWords(String str){
//        String rev = "";
//
//        for (int i = str.length()-1; i >=0; i--){
//            rev = rev + str.charAt(i);
//        }
//
//        return rev;
//
//    }

    public static String revWords(String str){
        char a[] = str.toCharArray();
        String rev = "";
        int length = a.length;

        for (int i = length-1; i >=0; i--){
            rev = rev + a[i];
          }

        return rev;

    }

}
