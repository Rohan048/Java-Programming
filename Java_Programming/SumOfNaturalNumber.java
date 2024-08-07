import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int n, sum = 0;
        System.out.println("Enter no of term...");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println("");
        System.out.println("Addition " + sum);
    }
}
