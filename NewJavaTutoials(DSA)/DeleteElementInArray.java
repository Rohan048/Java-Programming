import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int size, loc, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter Array elements:- ");
        for (i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter array location: ");
        loc = sc.nextInt();

        for (i = loc; i < size - 1; i++) {
            a[i] = a[i + 1];
        }
        size--;
        System.out.println("New Array: ");
        for (i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
    }
}
