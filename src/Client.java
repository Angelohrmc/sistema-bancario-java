public class Client {
    private int code;
    private String name;
    private String cpf;
    private String address;
    private Account account;

    public Client(int code, String name, String cpf, String address){
        this.code = code;
        this.name = name;
        this.cpf = cpf;
        this.address = address;
    }

    public void printData(){
        System.out.println("Código: " + code);
        System.out.println("Nome: " + name);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + address);
        System.out.println("Saldo: " + account.checkBalance());
        System.out.println("Data de criação: " + account.getCreateDate());
    }

    public void addAccount(Account account){
        this.account = account;
    }

    public String getName(){
        return name;
    }
}
