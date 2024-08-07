import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        int r;
        Float Area;
        float PI = 22 / 7;

        System.out.println("Enter radius of circle...");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        Area = PI * r * r;
        System.out.println("Area of circle " + Area);

    }
}
