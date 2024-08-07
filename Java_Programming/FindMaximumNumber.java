import java.util.Scanner;

public class FindMaximumNumber {
    public static void main(String[] args) {
        int a, b;

        System.out.println("Please enter two numbers.....");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {
            System.out.println("Maximum number is " + a);
        } else {
            System.out.println("Maximum number is " + b);
        }
    }
}
