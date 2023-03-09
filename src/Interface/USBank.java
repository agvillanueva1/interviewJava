package Interface;

public interface USBank {
    // a variable CAN be defined in an Interface
    int min_bal = 100;

    public void debit();

    public void credit();

    public void transferMoney();

    public void trading();

    // no method body, only method declaration
    // define only the method prototype
    // we cannot create the object of interface. Interface cannot be instantiated
    // no static methods allowed
    // but interface variables are static in nature by default
    // 100% abstraction

    //----------
    //a particular class can have multiple parent interfaces

}
