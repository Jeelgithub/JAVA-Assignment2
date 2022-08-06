class account_1 {
    private int id;
    double balance;
    private static double annualInterestRate;
    private java.util.Date dateCreated;

    public account_1() {
        dateCreated = new java.util.Date();
    }

    public account_1(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        dateCreated = new java.util.Date();
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int newId) {
        id = newId;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public static void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 1200);
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
public class checkAcc{



    public static void main (String[] args) {
        SavingAccount savings = new SavingAccount(5,1500);
        CheckingAccount checking = new Checkingaccount_1(4,1500);
        account_1 account = new account_1();
        savings.withdraw(2000);
        checking.checking(3000);
        System.out.println(savings.getBalance());
        System.out.println(checking.getBalance());

    }

    public static void Print (double x){
        System.out.println("The current balance is "+" Rs "+x);
    }
}
public class Checkingaccount_1 extends account_1 {
    double overDraft = -1000;

    public Checkingaccount_1(int newId, double newBalance) {
        super(newId, newBalance);
    }

    public void checking(double i) {

        if (balance - i < overDraft){
            System.out.println("Failure: Can't overdraft more than Rs1,000" + "A Rs 25 overdraft fee will be issued to your account. ");
            balance = balance - 25; }
        else
            balance = balance - i;
    }
}
public class SavingAccount extends Account{
    double overdraftLimit = 0;

    public SavingAccount(int newId, double newBalance) {
        super(newId, newBalance);
    }

    public void withdraw (double w) {
        if (balance - w < overdraftLimit)
            System.out.println("Insufficient Funds");
        else
            balance = balance - w;
    }
}