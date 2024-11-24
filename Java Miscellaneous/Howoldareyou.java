import java.util.*;
import java.time.*;
public class Howoldareyou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate today = LocalDate.now();
        System.out.println("Enter your birth year:");
        int Birthyear = sc.nextInt();
        System.out.println("Enter your birth month:");
        int Birthmonth = sc.nextInt();
        System.out.println("Enter your birth date:");
        int Birthdate = sc.nextInt();
        LocalDate birthDate = LocalDate.of(Birthyear, Birthmonth, Birthdate);
        int years = Period.between(birthDate, today).getYears();
        System.out.println("You were born on "+birthDate);
        System.out.println("The date today is "+today);
        System.out.println("You are "+years+" years old");
    }
}
