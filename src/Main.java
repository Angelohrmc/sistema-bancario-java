public static void main(String[] args) {
    //Adding banks
    Bank bank1 = new Bank("A", 1, 3032);
    Bank bank2 = new Bank("B", 2, 3033);
    Bank bank3 = new Bank("C", 3, 3034);

    //Adding Client
    Client client1 = new Client(1, "Client1", "123.456.789-09", "Rua 1, 45");
    Client client2 = new Client(2, "Client2", "987.654.321-00", "Rua 2, 54");
    Client client3 = new Client(3, "Client3", "321.654.987-05", "Rua 3, 90");

    //Adding accounts
    Account account1 = new Account(client1, LocalDate.now(), 1000);
    Account account2 = new Account(client2, LocalDate.now(), 1500);
    Account account3 = new Account(client3, LocalDate.now(), 2000);

    //Adding accounts to clients
    client1.addAccount(account1);
    client2.addAccount(account2);
    client3.addAccount(account3);

    //Checking clients
    client1.printData();
    client2.printData();
    client3.printData();

    //Adding accounts on banks
    bank1.addAccount(account1);
    bank2.addAccount(account2);
    bank3.addAccount(account3);

    //Checking accounts
    bank1.checkAccounts();
    bank2.checkAccounts();
    bank3.checkAccounts();

    //Withdrawing money
    account1.withdraw(800);
    account2.withdraw(300);
    account3.withdraw(500);

    //Checking for changes
    System.out.println("Saldo: R$" + account1.checkBalance());
    System.out.println("Saldo: R$" + account2.checkBalance());
    System.out.println("Saldo: R$" + account3.checkBalance());

    //Depositing money
    account1.deposit(500);
    account2.deposit(800);
    account3.deposit(200);

    //Checking for changes
    System.out.println("Saldo: R$" + account1.checkBalance());
    System.out.println("Saldo: R$" + account2.checkBalance());
    System.out.println("Saldo: R$" + account3.checkBalance());

    //Transfer time
    account1.transfer(account2, 400);
    System.out.println("Saldo: R$" + account1.checkBalance());
    System.out.println("Saldo: R$" + account2.checkBalance());

    account3.transfer(account1, 700);
    System.out.println("Saldo: R$" + account3.checkBalance());
    System.out.println("Saldo: R$" + account1.checkBalance());
}
