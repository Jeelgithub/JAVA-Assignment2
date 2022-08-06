import java.util.*;
	

	public class account {
	    //declare variable as given in question
	    static public int id;
	    static public double balance;
	    final static private double annualInterestRate = 7;
	    static public String dateCreated;
	

	    //default constructor
	    public account() {
	        id = 0;
	        balance = 500;
	        dateCreated = "09/10/2004";
	    }
	

	    //object of scanner class
	    static Scanner s = new Scanner(System.in);
	

	    //perimeterized constructor
	    public account(int Ac, double bal, String d) {
	        id = Ac;
	        balance = bal;
	        dateCreated = d;
	    }
	

	    //accessor method
	    public void Accessor() {
	        System.out.println("Your Account  :" + id);
	        System.out.println("Total balance in your account is  :" + balance + " Rupees");
	        System.out.println("The intrest given by the bank is  :" + annualInterestRate);
	        System.out.println("The at which your account was created is  :" + dateCreated);
	    }
	

	    //mutator method
	    public void mutator(int ac, double bal, String d) {
	        id = ac;
	        balance = bal;
	        dateCreated = d;
	    }
	

	    //method to get monthly Interest Rate
	    public double getMonthlyInterestRate() {
	        return annualInterestRate / 12;
	    }
	

	    //method to get monthly Interest
	    public double getMonthlyInterest() {
	        return (annualInterestRate / 12) * balance / 100;
	    }
	

	    //withdraw method
	    public void withdraw(double draw) {
	        balance =  balance - draw;
	    }
	

	    //deposite method
	    public double deposit(double dep) {
	        return balance + dep;
	    }
	

	    //method overriding 
	    @Override
	    public String toString() {
	        String res = "";
	        res += "Account number : " + id + "\n";
	        res += "Balance in account is : " + balance + "\n";
	        res += "Annual Interest Rate given by bank is : " + annualInterestRate + "\n";
	        res += "Date of creation of account is : " + dateCreated + "\n";
	        return res;
	    }
	}