import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        int l, b, h; // length, breath,height
        int sp; // semiperimeter
        double Area;
        System.out.println("Enter sides of triangle");
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();

        sp = (l + b + h) / 2;
        Area = Math.sqrt(sp * (sp - l) * (sp - b) * (sp - h));
        System.out.println("Area of triangle " + Area);

    }
}
