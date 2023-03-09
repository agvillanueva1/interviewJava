package Practice;

import java.util.*;

public class SparateInts {
    public static void main(String[] args) {

        int num = 542;

        List<Integer> digits = new LinkedList<Integer>();

        while (num > 0) {
            digits.add(0, num % 10);
            num = num / 10;
        }

        System.out.println(Arrays.toString(digits.toArray())); // [5, 4, 2]
    }
}
