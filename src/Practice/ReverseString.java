package Practice;

public class ReverseString {
    public static void main(String[] args) {

        String str = "PURPLE";

        int len = str.length();
        String rev = "";

        for (int i = str.length()-1; i >=0; i--){
            rev = rev + str.charAt(i);
        }

        System.out.println(rev);



/*
        char a[] = str.toCharArray();
*/
/*
        int length = a.length;

        for(int i = a.length-1; i >=0; i-- ){
            rev = rev + a[i];
        }
*/ 



/*        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());*/
    }

}
