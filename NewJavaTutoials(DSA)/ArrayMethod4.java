import java.util.Scanner;
import java.util.Arrays;

public class ArrayMethod4 {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array element: ");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        int b[] = Arrays.copyOf(a, 5); // method in array
        System.out.println("Copy Array element in another array: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(b[i]);
        }

    }
}
