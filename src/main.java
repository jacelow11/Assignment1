public class main {
    public static void main(String [] args){
//        persona person = new persona("John Doe", "123 Main St", "555-1234", "john@example.com");
//        person.DisplayInfo();
        Students student = new Students("Alice Smith", "456 Elm St", "555-5678", "alice@example.com", Students.JUNIOR);
        student.DisplayInfo();
        System.out.println("_________________________");
//        Employee employee = new Employee("Bob Johnson", "789 Oak St", "555-9101", "bob@example.com", "Office 101", 50000);
//        Faculty faculty = new Faculty("Carol Williams", "101 Pine St", "555-1112", "carol@example.com", "Office 202", 75000, "9am-5pm", "Professor");
//        Staff staff = new Staff("David Brown", "222 Cedar St", "555-1314", "david@example.com", "Office 303", 40000, "Manager");
//
//        System.out.println(person);
//        System.out.println(student);
//        System.out.println(employee);
//        System.out.println(faculty);
//        System.out.println(staff);
        Account account =new Account("876545",900,"ahmed abdi ");
        account.DisplayInfo();
        System.out.println("_____________________________________________________________________");
        Savingaccount saving =new Savingaccount("9383737",800,"Mohamed Hassan Ali");
        saving.DisplayInfo();
    }
}
