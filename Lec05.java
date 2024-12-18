import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User john = new User("John",1954,2,18);
        User flook = new User("Flook",1954,12,18);
        john.displayInfo();
        Admin nicolas = new Admin("Nicolus",1964,1,7);
        Admin Nemos = new Admin("Nemo",1964,12,18);

        nicolas.displayInfo();
        nicolas.displayInfo(true);
        nicolas.displayInfo(false);
        john.displayHappyBirthday();
        nicolas.displayHappyBirthday();
        Nemos.displayHappyBirthday();
        flook.displayHappyBirthday();
    }
}
