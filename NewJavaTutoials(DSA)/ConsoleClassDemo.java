import java.io.Console;

public class ConsoleClassDemo {
    public static void main(String[] args) {
        String name;
        char ps[];
        Console sc = System.console();
        System.out.println("Enter your name: ");
        name = sc.readLine();
        System.out.println("Enter password: ");
        ps = sc.readPassword();
        String a = String.valueOf(ps);

        System.out.println("Name: " + name);
        System.out.println("Password: " + a);
    }
}
