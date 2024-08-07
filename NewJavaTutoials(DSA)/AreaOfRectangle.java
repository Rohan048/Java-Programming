import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        int l, b, Area; // length and breath

        System.out.println("Enter sides of rectangle");
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        b = sc.nextInt();

        Area = l * b;
        System.out.println("Area of rectangle " + Area);

    }
}
