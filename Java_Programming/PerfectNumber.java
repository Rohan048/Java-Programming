import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int n, sum = 0;
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // 6=>12345 ->1+2+3=6
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (n == sum) {
            System.out.println("perfect Number");
        } else {
            System.out.println("Not perfect Number");
        }
    }
}
