import java.util.Arrays;

public class ArrayEqualCheck {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 50 };
        int b[] = { 10, 20, 30, 40, 50 };

        /*  only depends upon array vaiable */
        // if (a == b) {
        //     System.out.println("both are same");
        // } else {
        //     System.out.println("both are not same");
        // }


        /*Depends upon array data */
        if (Arrays.equals(a, b)) {
            System.out.println("both are same");
        } else {
            System.out.println("both are not same");
        }
    }
}
