class BankAccount{
    public double balance;
    public BankAccount(double balance)
    {
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance += amount;
            System.out.println("Diposited amount: " + amount);

        }
        else{
            System.out.println("Deposit amount must be positive");
        }
    }
    public void withdraw(double amount)
    {
        if(amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
        else{
            System.out.println("Withdrawal failed. check balance");
        }
    }
    public void checkBalance()
    {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount{
    public double Withdrawal_Limit = 1000;

    public SavingsAccount(double balance)
    {
        super(balance);
    }
    @Override
    public void withdraw(double amount){
        if(amount > Withdrawal_Limit)
        {
            System.out.println("Withdrawal failed. Withdrawal limit: "+Withdrawal_Limit);
        }
        else if(amount > balance)
        {
            System.out.println("Insufficient Balance");
        }
        else{
            balance -= amount;
            System.out.println("Withdrawn from Savings Account: " + amount);
        }
    }
}
class CurrentAccount extends BankAccount{
    public double Withdrawal_Limit = 5000;

    public CurrentAccount(double balance)
    {
        super(balance);
    }
    @Override
    public void withdraw(double amount){
        if(amount > Withdrawal_Limit)
        {
            System.out.println("Withdrawal failed. Withdrawal limit: "+Withdrawal_Limit);
        }
        else if(amount > balance)
        {
            System.out.println("Insufficient Balance");
        }
        else{
            balance -= amount;
            System.out.println("Withdrawn from Current Account: " + amount);
        }
    }
}
public class MethodProblem1 {
    public static void main(String[] args) {
        // Create accounts
        SavingsAccount savings = new SavingsAccount(2000);
        CurrentAccount current = new CurrentAccount(8000);

        // Savings Account
        System.out.println("Savings Account:");
        savings.deposit(500);
        savings.withdraw(1200);  // Should fail (limit 1000)
        savings.withdraw(800);   // Should succeed
        savings.checkBalance();

        System.out.println("\nCurrent Account:");
        // Current Account
        current.deposit(1000);
        current.withdraw(6000);  // Should fail (limit 5000)
        current.withdraw(4000);  // Should succeed
        current.checkBalance();
    }
}
