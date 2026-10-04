import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int c[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < c.length; i++) {
            System.out.print("enter the values  at index " + i);
            c[i] = sc.nextInt();
        }
        for (int age : c) {
            System.out.println("array is " + age);
        }
        sc.close();
    }
}
