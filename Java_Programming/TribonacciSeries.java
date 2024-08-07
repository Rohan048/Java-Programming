import java.util.Scanner;

public class TribonacciSeries {
    public static void main(String[] args) {
        int term, a = 0, b = 1, c = 2, d;
        System.out.println("Enter term: ");
        Scanner sc = new Scanner(System.in);
        term = sc.nextInt();

        for (int i = 1; i <= term; i++) {
            System.out.print(a+" ");
            d = a + b + c;
            a = b;
            b = c;
            c = d;

        }
    }
}
