package Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemoAndCountLetters {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(10, "Agatha");
        map.put(20, "Ketarin");
        map.put(30, "Mom");
        map.put(40, "Dad");

        System.out.println("Initial Mapping: " + map);

        System.out.println(map.get(10));
        System.out.println(map.get(20));

        System.out.println(countLetters("ag a tha"));



    }

    public static Map<Character, Integer> countLetters (String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            //if (!String.valueOf(ch).isBlank()){
                if (map.containsKey(ch)) {
                    int value = map.get(ch);
                    map.put(ch, value + 1);
                } else {
                    map.put(ch, 1);
                }
        }
//}

        return map;

    }
}
