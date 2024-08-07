import java.util.Scanner;
import java.util.Arrays;
public class ArrayMethod3 {
    public static void main(String[] args) {
        int a1[] = new int[5];
        int a2[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array element: ");
        for (int i = 0; i < 5; i++) {
            a1[i] = sc.nextInt();
        }

        System.out.println("Enter second array element: ");
        for (int i = 0; i < 5; i++) {
            a2[i] = sc.nextInt();
        }

        boolean b= Arrays.equals(a1,a2);   //method in array
        System.out.println("Array a1 and a2 are same? "+b);
    }      
}


