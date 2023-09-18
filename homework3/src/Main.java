
public class Main
{
    public static void main(String[] args) {
        int balance1;
        int balance2;
        int acc1;
        int acc2;

        Bank account1=new Bank(); // create Object

        account1.deposit(100);
        account1.deposit(200);
        account1.withdraw(170); //130


        Bank account2=new Bank(); // create Object

        account2.deposit(100);
        account2.deposit(1000);
        account2.withdraw(350); //750

        Bank total=new Bank();

        System.out.println("account1 "+ account1.getAccountNumber());
        System.out.println("account2 "+ account2.getAccountNumber());

        System.out.println("balance1 "+ account1.getBalance());
        System.out.println("balance2 "+ account2.getBalance());

        System.out.println("bank balance "+ Bank.getBankBalance());
        System.out.println("total accounts "+ Bank.getTotalAccounts());

        account2.withdraw(760); //fail

        account1.transfer(100, account2);
        System.out.println("account1 -> account2 : "+ account1.getBalance() +" , "+ account2.getBalance()); //result = 30, 850

        account2.transfer(900, account1); //didn't change
        System.out.println("account1 & account2 : "+ account1.getBalance() +" , "+ account2.getBalance());
    }
}
