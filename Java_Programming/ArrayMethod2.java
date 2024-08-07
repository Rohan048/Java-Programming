import java.util.Scanner;
import java.util.Arrays;

public class ArrayMethod2 {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array element: ");

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);                          // method in array
        System.out.println("sort() method: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);              // by default this  method is seperate the array in assending order
        }
    }
}
