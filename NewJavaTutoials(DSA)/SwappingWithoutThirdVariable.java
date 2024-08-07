import java.util.Scanner;

public class SwappingWithoutThirdVariable {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter value of a:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter value of b:");
        b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Value of a: " + a);
        System.out.println("value of b: " + b);
    }
}
