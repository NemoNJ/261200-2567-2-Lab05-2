import java.time.LocalDate;

public class Admin extends User {
    Admin(){
        super();
    }
    Admin(String name,int year,int month,int date){
        super(name,year,month,date);
    }
    public void displayInfo(){
        System.out.println("----------------------------\n");
        System.out.println("User type: admin.");
        System.out.println(name+" was born on "+dob+"\n");
        System.out.println("----------------------------\n");
    }
    public void displayInfo(boolean full){
        if(full){
            System.out.println("----------------------------\n");
            System.out.println("Name : "+name);
            System.out.println("Brithday : "+dob);
            System.out.println("User type: admin.");
            System.out.println("Today date : "+LocalDate.now()+"\n");
            System.out.println("----------------------------\n");
        }else{
            System.out.println("----------------------------\n");
            System.out.println(" Name : "+name+"\n");
            System.out.println("----------------------------\n");
        }
    }
    public void displayHappyBirthday() {
        LocalDate today = LocalDate.now();
        int age = today.getYear() - year;
        if(isBirthday()) {
            System.out.println("------------------------------------------------------\n");
            System.out.println("Happy birthday " + this.name + "! You are " + age + "!\n");
            System.out.println("-------------------------------------------------------\n");
        }else System.out.println("Not "+this.name+" birthday !\n");
    }
}
