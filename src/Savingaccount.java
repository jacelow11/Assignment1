import java.util.Date;

public class Savingaccount extends Account{
    double minimumBalance;
    public Savingaccount(String accountNumber, double balance, String fullName) {
        super(accountNumber, balance, fullName);
        this.minimumBalance=balance;
    }

    @Override
    public String getAccountNumber() {
        return super.getAccountNumber();
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    @Override
    public Date getDateCreated() {
        return super.getDateCreated();
    }

    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
    }

    public void DisplayInfo(){
        System.out.println("Name : "+this.getFullName());
        System.out.println("Mobile Number :"+this.getAccountNumber());
        System.out.println("Minimum Balance : "+this.minimumBalance);


    }
}
