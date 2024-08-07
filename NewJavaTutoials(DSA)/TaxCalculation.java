import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
        int sal;
        double tax;
        System.out.println("Enter  you Salary...");
        Scanner sc = new Scanner(System.in);
        sal = sc.nextInt();

        if (sal <= 10000) {
            System.out.println(sal + " No text ");
        } else if (sal >= 10000 && sal <= 100000) {
            tax = sal * 0.1;
            System.out.println(sal + " " + tax);
        } else {
            tax = sal * 0.2;
            System.out.println(sal + " " + tax);
        }

    }
}
