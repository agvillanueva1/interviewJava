package SamsungPrep;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesStr {
    public static void main(String[] args) {
        System.out.println(removeDupes("aaaaaaaaaaabbbbbbbbbcccc"));

    }

    public static String removeDupes(String str){
        Set<Character> set = new LinkedHashSet<>();
        //Only unique characters can be added to the set and maintains insertion order

        for (int i=0; i<str.length();i++){
            set.add(str.charAt(i));
        }
        StringBuilder sbResult = new StringBuilder();
        for (char el : set) {
            sbResult.append(el);
        }

        return sbResult.toString();

    }

}
