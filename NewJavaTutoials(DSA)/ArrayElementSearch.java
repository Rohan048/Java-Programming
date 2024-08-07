import java.util.Scanner;

public class ArrayElementSearch {
    public static void main(String[] args) {
        int a[] = new int[5];
        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array element: ");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Printed Array-");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Enter search elements: ");
        n = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Element found");
        } else {
            System.out.println("Not found");
        }

    }
}
