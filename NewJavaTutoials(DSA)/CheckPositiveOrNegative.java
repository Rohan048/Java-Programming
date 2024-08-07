import java.util.Scanner;

public class CheckPositiveOrNegative {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n > 0) {
            System.out.println("Number is +ve " + n);
        } else if (n < 0) {
            System.out.println("Number is -ve " + n);
        } else {
            System.out.println("Other number");
        }
    }
}
