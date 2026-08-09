import java.util.Scanner;
import java.time.Year;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name : ");
        String name = sc.nextLine();
        System.out.print("enter your birth year : ");
        int by = sc.nextInt();
        int age = Year.now().getValue() - by;
        System.out.println("Your name is" + name + " and you are " + age + " year old");
        sc.close();
    }
}
