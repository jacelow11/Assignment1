import  java.util.Date;
public class Employee extends persona{    private String office;
    private double salary;
    private Date dateHired;

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new Date();
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }

}
