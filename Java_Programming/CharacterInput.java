import java.util.Scanner;

public class CharacterInput {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter your character....");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(4);
        System.out.println(ch);
    }
}
