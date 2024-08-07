import java.util.Scanner;

public class FindFactor {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number...");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println("Factor of " + n + " : ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
