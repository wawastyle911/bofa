import java.util.ArrayList;

public abstract interface IAccount{


    double deposit(double d);
    
    double withdrawal(double w);
    
    void displayAllTransactions();
    
    //ArrayList<Transactions> getTransactions();
    
    String toString();

    void transferBalance(SpotAccount sA, double amount);


    
}