import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array element: ");

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Printed elements-");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Array in Reverse order-");

        for (int i = 5 - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
