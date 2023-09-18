class Bank{
    private int balance;
    private int accountNbr;
    static int bankBalance;
    static int totalAccounts;

    public Bank(){ //constructor
        totalAccounts++;
        accountNbr=totalAccounts;

    }

    void deposit(int money){
        // add money to my balance
        balance+=money;
        bankBalance+=money;
    }

    void withdraw(int money){
        // remove money from my balance
        if (balance > money)
        {
            balance-=money;
            bankBalance-=money;
        }
        else
        {
            System.out.println("You don't have enough money.");
        }
    }

    int getBalance(){
        return balance;
        //System.out.println("Your balance is", balance);
    }

    int getAccountNumber(){
        return accountNbr;
        //System.out.println("Your accountNumber is", accountNbr);
    }

    static int getTotalAccounts(){
        return totalAccounts;
        //System.out.println("Total accounts are", totalAccounts);
    }

    static int getBankBalance(){
        return bankBalance;
        //System.out.println("Bank's balance is", bankBalance);
    }

    void transfer(int money, Bank receiver){ //I can't send it to the wrong account because I get it as a bank class.
        if (this.balance > money)
        {
            this.balance -= money;
            receiver.deposit(money);
        }
        else
        {
            System.out.println("You don't have enough money.");
        }
    }
}