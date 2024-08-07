import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        int a, b, temp;
        System.out.println("Enter value of a:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter value of b:");
        b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("Value of a: " + a);
        System.out.println("value of b: " + b);
    }
}
