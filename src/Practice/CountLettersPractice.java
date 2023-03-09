package Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountLettersPractice {
    public static void main(String[] args) {

        System.out.println(countLetters("hello"));
        System.out.println(countLetters("aaabbbc"));
        System.out.println(countLetters("abc"));


        // "hello" // {h=1, e=1, l=2, o=1}
        // "aaabbbc" // {a=3, b=3, c=1}
        //"abc" // {a=1, b=1, c=1}

    }

    public static Map<Character, Integer> countLetters(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char ch : str.toCharArray()){
            if(map.containsKey(ch)){
                int value = map.get(ch);
                map.put(ch, value +1);
            }else{
                map.put(ch, 1);
            }
        }

        return map;
    }


}
