import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int n, f = 1;
        System.out.println("Enter number....");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println("Factorial " + f);
    }
}
