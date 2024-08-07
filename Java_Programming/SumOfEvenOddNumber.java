import java.util.Scanner;

public class SumOfEvenOddNumber {
    public static void main(String[] args) {
        int n, sum = 0;
        System.out.println("Enter Range.....");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even number....");
            for (int i = 0; i <= n; i = i + 2) {
                System.out.println(i);
                sum = sum + i;
            }
            System.out.println("Addition of Even number " + sum);
        } else {
            System.out.println("Odd Number....");
            for (int i = 1; i <= n; i = i + 2) {
                System.out.println(i);
                sum = sum + i;
            }
            System.out.println("Addition of Odd number " + sum);
        }
    }
}
