package SamsungPrep;

public class CountEachLetterStr {
    public static void main(String[] args) {
        System.out.println(countCharOccurence("Java Programming Java Oops"));

    }

    public static int countCharOccurence(String word){
        int totalcount = word.length();

        int totalcountAfterRemove = word.replace("a", "").length();

        int count = totalcount - totalcountAfterRemove;

        return count;
    }
}
