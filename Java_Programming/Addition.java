import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        int a, b, sum, sub, multi, div;
        System.out.println("Enter two number....");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        sum = a + b;
        sub = a - b;
        multi = a * b;
        div = a / b;

        System.out.println("Addition " + sum);
        System.out.println("Sub " + sub);
        System.out.println("Multi " + multi);
        System.out.println("Div " + div);
    }
}
