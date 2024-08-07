import java.util.Scanner;

public class ifElseLadder {
    public static void main(String[] args) {
        int marks;
        System.out.println("Enter marks...");
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();

        if (marks > 80) {
            System.out.println("topper");
        } else if (marks < 80 && marks >= 60) {
            System.out.println("first");
        } else if (marks < 60 && marks >= 40) {
            System.out.println("Second");
        } else {
            System.out.println("fail");
        }

    }
}
