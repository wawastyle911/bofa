import java.util.ArrayList;

public class Account implements IAccount{
    static int counter;
    double balance;
   // ArrayList<Transactions> transactions = new ArrayList<Transactions>();
    String type;
    int accountNumber;
    
    public Account(){
        counter++;
        this.accountNumber = counter;
        this.balance = 0.0;
        
    }

     public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        SpotAccount.counter = counter;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }



    @Override
    public double deposit(double d) {
        this.balance += d;
        String s;
     //add transaction deposit
        return this.balance;
    }

    @Override
    public void displayAllTransactions() {
        //for(int i = 0; i < transactions.size(); i++){
       //    System.out.println(transactions.get(i).toString());
       // }
    }

    //@Override
    //public ArrayList<Transactions> getTransactions() {
    //    return this.transactions;
    //}

    @Override
    public double withdrawal(double w) {
        this.balance -= w;
        //add transaction withdrawal
        return this.balance;
    }
     
     @Override
    public void transferBalance(SpotAccount sA, double amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
