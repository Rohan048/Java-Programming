import java.util.Scanner;

public class MirrorMatrixInArray {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array element: ");

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("2D Array: ");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Mirror Matrix: ");
        for (int i = 0; i <= 1; i++) {
            for (int j = 1; j >= 0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
