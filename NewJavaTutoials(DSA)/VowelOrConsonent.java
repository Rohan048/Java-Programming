import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter your character....");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||
                ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println("Vowel...");
        } else {
            System.out.println("Consonent");
        }
    }
}
