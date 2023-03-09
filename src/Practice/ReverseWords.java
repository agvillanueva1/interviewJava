package Practice;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(revWords("I love agatha")); // I evol ahtaga
        System.out.println(revWords("hello babe"));
        System.out.println(revWords("I eat fruits everyday"));
    }

    public static String revWords (String str) {

        String[] words = str.split("\\s");

        String reverseword = "";

        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();

            reverseword = reverseword + sb.toString() + " ";
        }

        return reverseword;
    }
}
