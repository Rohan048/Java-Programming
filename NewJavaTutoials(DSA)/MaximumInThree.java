import java.util.Scanner;

public class MaximumInThree {
    public static void main(String[] args) {
        int a, b, c;

        System.out.println("Please enter three numbers.....");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("Maximum number is " + a);
            } else {
                System.out.println("Maximum number is " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Maximum number is " + b);
            } else {
                System.out.println("Maximum number is " + c);
            }
        }
    }
}
