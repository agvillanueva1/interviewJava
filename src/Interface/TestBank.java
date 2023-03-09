package Interface;

public class TestBank {
    public static void main(String[] args) {

        ICICIBank ic = new ICICIBank();
        ic.educationLoan();
        ic.homeLoan();
        ic.carLoan();

        ic.credit();
        ic.debit();
        ic.trading();
        ic.transferMoney();

        ic.mutualFunds();
        ic.insurance();

        System.out.println(USBank.min_bal);

        //Cannot create an object of interface BUT
        // I CAN create a reference of interface, us, which can refer to child clas obj
        USBank us = new ICICIBank();
        us.credit();
        us.transferMoney();

        // With the help if USBank interface reference variable, I can call only those methods
        // which are overriden from USBank interface

        //Webdiver driver = new ChromeDriver; Webdriver is an Interface, ChromesDriver is a class


    }
}
