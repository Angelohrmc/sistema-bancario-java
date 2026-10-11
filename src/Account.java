import java.time.LocalDate;

public class Account {
    private Client client;
    private LocalDate createDate;
    private double balance;

    public Account(Client client, LocalDate createDate, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Saldo inicial inválido.");
        }

        this.client = client;
        this.createDate = createDate;
        this.balance = balance;
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Valor inválido.");
        }
        else if(amount > balance) {
            System.out.println("Saldo indisponível.");
        }
        else {
            balance -= amount;
        }
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Valor inválido.");
        }
        else {
            balance += amount;
        }
    }

    public void transfer(Account destination, double amount) {
        if (destination == null) {
            System.out.println("Conta de destino inválida.");
        }
        else if (destination == this) {
            System.out.println("Não é possível transferir para a mesma conta.");
        }
        else if (amount <= 0) {
            System.out.println("Valor inválido.");
        }
        else if (amount > balance) {
            System.out.println("Saldo insuficiente.");
        }
        else {
            withdraw(amount);
            destination.deposit(amount);
            System.out.println("Transferência realizada com sucesso.");
        }
    }

    public Client getClient(){
        return client;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public double checkBalance(){
        return balance;
    }
}
