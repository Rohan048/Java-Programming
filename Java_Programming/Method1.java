import java.util.Scanner;

public class Method1 {

    int n1, n2;
    int add, sub, multi, div;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Method1 m = new Method1();
        m.input();
        m.process();
        m.output();
    }

    void input() {
        System.out.println("Enter two numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
    }

    void process() {
        add = n1 + n2;
        sub = n1 - n2;
        multi = n1 * n2;
        div = n1 / n2;
    }

    void output() {
        System.out.println("Add " + add);
        System.out.println("Sub " + sub);
        System.out.println("Multi " + multi);
        System.out.println("Div " + div);
    }
}
