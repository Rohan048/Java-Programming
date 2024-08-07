import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String[] args) {
        int n, p, result = 1;

        System.out.println("Please enter number.....");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter power...");
        p = sc.nextInt();

        for (int i = 1; i <= p; i++) {
            result = n * result;
        }
        System.out.println("Power of " + n + " is " + result);
    }
}