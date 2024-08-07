import java.util.Scanner;;

public class AverageOfMarks {
    public static void main(String[] args) {
        int a, b, c, d, e, sum = 0, Average = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in Math: ");
        a = sc.nextInt();
        System.out.println("Enter marks in English: ");
        b = sc.nextInt();
        System.out.println("Enter marks in Hindi: ");
        c = sc.nextInt();
        System.out.println("Enter marks in Physics: ");
        d = sc.nextInt();
        System.out.println("Enter marks in Chemistry: ");
        e = sc.nextInt();

        sum = a + b + c + d + e;
        Average = sum / 5;
        System.out.println("Average of all subjects: " + Average);

    }
}
