import java.util.Scanner;

public class ArmstrongNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        armstrong(n);
        scanner.close();
    }

    public static void armstrong(int n) {
        int digit = 0;
        int r, sum = 0, temp;
        temp = n;
        while (temp > 0) {
            digit++;
            temp = temp / 10;
        }
        int d = digit;
        temp = n;
        while (temp > 0) {
            r = temp % 10;
            sum = sum + (int) Math.pow(r, d);
            temp = temp / 10;
        }
        if (n == sum) {
            System.out.println("It is armstrong");
        } else {
            System.out.println("It is not armstrong");
        }
    }
}
