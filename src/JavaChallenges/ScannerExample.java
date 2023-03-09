package JavaChallenges;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float floatAge = 0.0f;

        boolean validFloatAge = false;

        do {
            System.out.println("Please enter your age");
            String age = scanner.nextLine();
            try {
                floatAge = Float.parseFloat(age);
                validFloatAge = true;
            } catch (NumberFormatException e) {
                System.out.println("You did not enter a real float");
            }
        } while (validFloatAge==false);
        System.out.println("Your age is" + floatAge);

        scanner.close();

    }


}
