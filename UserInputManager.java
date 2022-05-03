import java.util.Scanner;

public class UserInputManager {
    public int retrieveAccountNumber() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the account number of the desired account:");               
        int accountNumber = s.nextInt();
        if(accountNumber <= Account.getCounter() && accountNumber >= 0){
            return accountNumber;
        }
        else{
            System.err.println("This account doesn't exist.");
            return retrieveAccountNumber();
        }
    }

    
    public Account retrieveAccountType() {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter user id: ");
        int id = s.nextInt();
     
        System.out.println("Please enter the type of new account desired (for future account:f for spot account:s): ");
        Scanner sc = new Scanner(System.in);
        String accountType = sc.nextLine();
        if(accountType.equals("s")){
            SpotAccount sa = new SpotAccount();
            return sa;
        }
        else if (accountType.equals("f")){
            FuturesAccount sa = new FuturesAccount(); 
            return sa;
        }
        else{
            System.err.println("This account type doesn't exist.");
            return retrieveAccountType();
        }
    }
    
   

    
    public Client retrieveClientInfo() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter client first name: ");
        String firstName = s.nextLine();
        System.out.println("Please enter client last name: ");       
        String lastName = s.nextLine();
        Client c = new Client(firstName, lastName);
        System.out.println("Client successfuly registered, your id is " + c.getId());
        return c;
    }

    
    public double retrieveTransactionAmount() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the desired amount for the current transaction: ");   
        double amount = s.nextDouble();        
        if(amount > 0){
            return amount;
        }
        else{
            return retrieveTransactionAmount();
        }
    }

    
    public int retrieveUserOption() {
        Scanner s = new Scanner(System.in);
        System.out.println("[1] Add a new Client  \n" +
            "[2] Create a new Account \n" +
            "[3] Make a Deposit             \n" +
            "[4] Make a Withdrawal \n" +
            "[5] List Account Transactions  \n" +
            "[6] List Clients\n" +
            "[7] List Client Accounts"); 
        return s.nextInt();
    }
    

    
}