import java.util.Scanner;

public class InputMonthAndPrintnoOfDay {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter month number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n == 1) {
            System.out.println("jan = 31 days");
        } else if (n == 2) {
            System.out.println("feb = 28 days");
        } else if (n == 3) {
            System.out.println("March = 31 days");
        } else if (n == 4) {
            System.out.println("April = 30 days");
        } else if (n == 5) {
            System.out.println("May = 31 days");
        } else if (n == 6) {
            System.out.println("June = 30 days");
        } else if (n == 7) {
            System.out.println("July = 31 days");
        } else if (n == 8) {
            System.out.println("August = 31 days");
        } else if (n == 9) {
            System.out.println("Sep = 30 days");
        } else if (n == 10) {
            System.out.println("Oct = 31 days");
        } else if (n == 11) {
            System.out.println("Nov = 30 days");
        } else if (n == 12) {
            System.out.println("Dec = 31 days");
        } else {
            System.out.println("Invalid");
        }
    }
}
