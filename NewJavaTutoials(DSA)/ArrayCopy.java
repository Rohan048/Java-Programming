import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array element: ");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
         System.out.println("Printed first Array-");
        for (int i = 0; i < a.length; i++) {
             System.out.println(a[i]);
        }
        System.out.println("Printed second Array-");
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            System.out.println(b[i]);
        }
    }
}

// when any program you want to take input in first array
// and print second array then you use this code.......!

// import java.util.Scanner;
// public class ArrayCopy {
//     public static void main(String[] args) {
//         int a[] = new int[5];
//         int b[] = new int[5];
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first array element: ");

//         for (int i = 0; i < a.length; i++) {
//             a[i] = sc.nextInt();
//         }
//         for (int i = 0; i < a.length; i++) {
//         }
//         System.out.println("Printed second Array-");
//         for (int i = 0; i < a.length; i++) {
//             b[i] = a[i];
//             System.out.println(b[i]);
//         }
//     }
// }