public class persona {
    private String name;
    private String address;
    private String Gender;

    private String phoneNumber;
    private String email;

    public persona(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return Gender;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }

    public void DisplayInfo(){
        System.out.println("Name : "+this.getName());
        System.out.println("Mobile Number :"+this.getPhoneNumber());
        System.out.println("Gender : "+this.getGender());
        System.out.println("Address :"+this.getGender());
        System.out.println("Email : "+this.getEmail());

    }
}
