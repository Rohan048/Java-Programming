import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n, b, r, s = 0;
        System.out.println("Enter any number..");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        b = n;

        while (n > 0) {
            r = n % 10;
            s = (s * 10) + r;
            n = n / 10;
        }
        if (b == s) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not palindrome number");
        }
    }
}