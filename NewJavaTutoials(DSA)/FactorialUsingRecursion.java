import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        FactorialUsingRecursion f = new FactorialUsingRecursion();
        int a = f.fact(n);
        System.out.println("Factorial: " + a);
    }

    int fact(int n) {
        if (n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }
}
