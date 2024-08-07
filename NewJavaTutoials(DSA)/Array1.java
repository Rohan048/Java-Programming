import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        size = sc.nextInt();

        int a[] = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Printed element: ");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
    }
}
