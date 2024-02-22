//Atminterface using java code
import java.util.Scanner;

class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        this.balance=initialBalance;
    }
    public double getbalance(){
        return balance;
    }
    public void deposite(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposite of Rupees"+amount+"successful. Current balance: Rs"+balance);
        }
        else{
            System.out.println("Invalid deposite amount.");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -=amount;
            System.out.println("Withdrawal of Rs"+amount+"successful. Current balance: Rs"+balance);
        }
        else{
            System.out.println("Invalid Withdrawal amount or Insufficient balance.");
        }
    }
}

class ATM{
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount){
        this.bankAccount =bankAccount;
    }

    public void displayMenu(){
        System.out.println("ATM Menu:");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposite");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
    }

    public void Perform(int choice,Scanner s){
        switch (choice) {
            case 1:
                System.out.println("Current balance: Rs"+bankAccount.getbalance());
                break;
            case 2:
                System.out.println("Enter Deposite Amount: ");
                double dA=s.nextDouble();
                bankAccount.deposite(dA);
                break;
            case 3:
                System.out.println("Enter Withdrawal Amount: Rs");
                double wA=s.nextDouble();
                bankAccount.withdraw(wA);
                break;
            case 4:
                System.out.println("Exiting. Thank You....!");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
public class AtmInterface{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Initial Bank Amount: Rs");
        double iA=s.nextDouble();
        BankAccount bA =new BankAccount(iA);
        ATM atm=new ATM(bA);
        while (true) {
            atm.displayMenu();
            System.out.println("Select an Option: ");
            int choice=s.nextInt();
            atm.Perform(choice, s);
            if(choice==4){
                break;
            }
        }
    }
}