import java.time.LocalDate;

public class Main {

    public static void currentYear() {
        int currentYear = LocalDate.now().getYear();
        if (currentYear % 4 != 0 && currentYear % 400 != 0) {
            System.out.println(" Не является высокосным");
        } else {
            System.out.println("Является высокосным");
        }
    }
    public static void main(String[] args) {
        currentYear();
    }
}




