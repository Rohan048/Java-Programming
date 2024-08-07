import java.util.Scanner;

public class PrintEvenNumber {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter number of term..");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("odd number");

        for (int i = 0; i <= n; i = i + 2) {
            System.out.println(i);
        }
    }
}
