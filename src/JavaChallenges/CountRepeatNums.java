package JavaChallenges;

import java.util.*;

public class CountRepeatNums {
    public static void main(String[] args) {
        System.out.println(countRepeatNum(2432565));  //  2=2, 4=1, 3=1, 5=2, 6=1
        System.out.println(countRepeatNum(111123443));
        System.out.println(countRepeatNum(22));
        System.out.println(countRepeatNum(145));

    }

    public static Map<Object, Integer> countRepeatNum(int num) {

        Map<Object, Integer> countMap = new LinkedHashMap<>();
        List<Integer> digits = new LinkedList<>();

        while (num > 0) {
            digits.add(0, num % 10);
            num = num / 10;
        }

        Object[] intNum = digits.toArray();


        for (Object item : intNum) {
            if (countMap.containsKey(item))
                countMap.put(item, countMap.get(item) + 1);
            else {
                countMap.put(item, 1);
            }
        }

        return countMap;
    }
}

