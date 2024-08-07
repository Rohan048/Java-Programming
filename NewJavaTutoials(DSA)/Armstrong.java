import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int n, b, r, s = 0;
        System.out.println("Enter any number..");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        b = n;

        if (n >= 10 && n <= 99) {
            while (n > 0) {
                r = n % 10;
                s = s + (r * r);
                n = n / 10;
            }
            if (b == s) {
                System.out.println("Armstrong number");
            } else {
                System.out.println("Not Armstrong number");
            }
        } else if (n >= 100 && n <= 999) {
            while (n > 0) {
                r = n % 10;
                s = s + (r * r * r);
                n = n / 10;
            }
            if (b == s) {
                System.out.println("Armstrong number");
            } else {
                System.out.println("Not Armstrong number");
            }
        } else {
            while (n > 0) {
                r = n % 10;
                s = s + (r * r * r * r);
                n = n / 10;
            }
            if (b == s) {
                System.out.println("Armstrong number");
            } else {
                System.out.println("Not Armstrong number");
            }
        }
    }
}
