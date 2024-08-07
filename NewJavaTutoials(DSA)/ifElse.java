import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {

        int n;
        System.out.println("EnteR any numbeR...");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n >= 0) {
            System.out.println("+ve numbeR");
        } else {
            System.out.println("-ve numbeR");
        }
    }
}
