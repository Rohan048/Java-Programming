import java.util.Scanner;

public class CalculationProgram {
    public static void main(String[] args) {
        int n1, n2, ch, cal;

        System.out.println("Enter two number...");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        System.out.println("Enter your Operation...");
        ch = sc.nextInt();

        if (ch == 1) {
            cal = n1 + n2;
            System.out.println("Addition " + cal);
        } else if (ch == 2) {
            cal = n1 - n2;
            System.out.println("Subtraction " + cal);
        } else if (ch == 3) {
            cal = n1 * n2;
            System.out.println("Multi " + cal);
        } else if (ch == 4) {
            cal = n1 / n2;
            System.out.println("Div " + cal);
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
