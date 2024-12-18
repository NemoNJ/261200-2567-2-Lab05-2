import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;
    protected int year;
    protected int month;
    protected int date;

    User(){
        this.name = null;
        this.dob = LocalDate.now(); // current date
    }
    User(String name,int year,int month,int date){
        this.year = year;
        this.month = month;
        this.date = date;
        this.name = name;
        this.dob = LocalDate.of(year,month,date);
    }
//    public void setName(String name){
//        this.name = name;
//    }
//    public void setDob(LocalDate dob){
//        this.dob = dob;
//    }
//    public String getName(){
//        return this.name;
//    }
//    public LocalDate getDob(){
//        return this.dob;
//    }
    public boolean isBirthday(){
        LocalDate today = LocalDate.now();
        return (today.getDayOfMonth() == date) && (today.getMonthValue() == month);
    }
    public void displayHappyBirthday() {
        System.out.println("----------------------------\n");
        if(isBirthday())
            System.out.println("Happy birthday " + this.name + "!\n");
        else System.out.println("Not "+this.name+" birthday !\n");
        System.out.println("----------------------------\n");
    }
    public void displayInfo(){
        System.out.println("----------------------------\n");
        System.out.println(name+" was born on "+dob+"\n");
        System.out.println("----------------------------\n");
    }
}
