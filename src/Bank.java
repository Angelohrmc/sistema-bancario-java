import java.util.ArrayList;

public class Bank {
    private String name;
    private int code;
    private int agency;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Bank(String name, int code, int agency){
        this.name = name;
        this.code = code;
        this.agency = agency;
    }

    public void addAccount(Account account){
        this.accounts.add(account);
    }

    public void checkAccounts(){
        for (Account account : accounts) {
        System.out.println("Cliente: " + account.getClient().getName() + ".");
        System.out.println("Saldo: " + account.checkBalance() + ".");
        System.out.println("Data de criação: " + account.getCreateDate() + ".");
        }
    }
}
