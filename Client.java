import java.util.ArrayList;

public class Client {
    private int id;
    private String firstName;
    private String lastName;
    public static ArrayList<Client> clients = new ArrayList<>();
    private ArrayList<Account> clientAccounts = new ArrayList<>();
    public Client(String firstName, String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = (int)(Math.random()*1000);
        clients.add(new Client(firstName, lastName, this.id));
    }
    public static ArrayList<Client> getClients(){
        return clients;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}