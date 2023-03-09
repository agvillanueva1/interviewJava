package Interface;

public class ICICIBank implements USBank, RBI {

    @Override
    public void educationLoan() {
        System.out.println("icici --edu loan");
    }

    @Override
    public void homeLoan() {
        System.out.println("icici --home loan");
    }

    @Override
    public void carLoan() {
        System.out.println("icici --car loan");
    }

    @Override
    public void debit() {
        System.out.println("icici --debit");
    }

    @Override
    public void credit() {
        System.out.println("icici --credit");
    }

    @Override
    public void transferMoney() {
        System.out.println("icici --transferMoney");
    }

    @Override
    public void trading() {
        System.out.println("icici --trading");
    }

    //ICICI bank class methods. Only avail by ICICIBank class.
    // These are not overridden methods. These are separate methods of ICICIBank class

    public void mutualFunds(){
        System.out.println("icici - mutual funds");
    }

    public void insurance(){
        System.out.println("icici - insurance");
    }
}
