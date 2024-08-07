import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number....");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n % 5 == 0) {
            System.out.println("Divisible by five");
        } else {
            System.out.println("Not divisible by five");
        }
    }
}
