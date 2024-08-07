import java.util.Scanner;

public class ASCIIvalueOfCharacter {

    public static void main(String[] args) {
        char ch;
        System.out.println("Enter your character....");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        int a = ch;
        System.out.println("ASCII value Of Character " + a);
    }
}
