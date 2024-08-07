import java.util.Scanner;

public class ArrayInDecendingOrder {

    public static void main(String[] args) {
        int a[] = new int[5];
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements: ");

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (a[i] < a[j]) {          //main khel to bas yaha h guru
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Array in Decending order: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}
