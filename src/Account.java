import java.util.Date;
public class Account {
    private String accountNumber;
    private  double balance;
    private Date dateCreated;
    private  String fullName;
    public  Account(String accountNumber,double balance,String fullName){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.dateCreated=new Date();
        this.fullName=fullName;
    }
    public  void deposit(double amount){
        balance+=amount;
    }
    public  void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }else
            System.out.println("insufficient ");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double checkBalance(){
        return balance;
    }
    public void DisplayInfo(){
        System.out.println("Name : "+this.getFullName());
        System.out.println("Mobile Number :"+this.accountNumber);
        System.out.println("Gender : "+this.checkBalance());
//        System.out.println("Address :"+this.getAddresss());
//        System.out.println("Email : "+this.getEMail());

    }

}

