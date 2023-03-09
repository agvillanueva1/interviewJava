package JavaChallenges;

public class LeapYear {
    public static void main(String[] args) {

        // if the year ends in 00, divide by 400 - if divisible, leap year
        //if it's not, it's a common year
        // for any year not ending in -00, if it divides by 4, then it's a leap year

        int year = 2012;
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;

                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }

        if (leap){
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year + " is not a leap year");
        }
    }
}
