import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter your number....");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i );
        }
    }
}
