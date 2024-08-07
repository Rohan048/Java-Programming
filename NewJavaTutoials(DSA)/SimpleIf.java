import java.util.Scanner;

public class SimpleIf {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter you age ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible for vote....");
        }

        System.out.println("Hello Rohan");
    }

}
