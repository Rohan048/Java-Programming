import java.util.Scanner;

public class SumOfMatrixInArray {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array element: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second array element: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("2D first array: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("2D second array: ");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of two matrix: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
