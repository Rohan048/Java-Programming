import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        // Case of infinite loop
        int n;
        System.out.println("Enter any number....");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (n >= 0) {
            System.out.println("Hello Rohan");
        }

        /*
         * int n = 1;
         * while (n <= 10) {
         * System.out.println("I can do it");
         * ++n;
         * }
         */

    }
}
