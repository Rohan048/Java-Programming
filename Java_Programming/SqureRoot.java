import java.util.Scanner;

public class SqureRoot {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        double m = Math.sqrt(n);

        System.out.println("SqureRoot of number " + m);
    }
}
