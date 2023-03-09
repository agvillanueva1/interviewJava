package SamsungPrep;

public class CountEachWordStr {


    public static void main(String[] args) {
        System.out.println(countWords("I am learning learning java java programming")); //7
        System.out.println(countWords("Welcome to java")); //3
        System.out.println(countWords("Hello")); //1
        System.out.println(countWords("a")); //1

    }

     public static int countWords(String str){
        int count = 1;
        for (int i=0; i< str.length()-1;i++){
            if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){
                count++;
            }
        }

         return count;  // Return the number of words in the string

     }
}
