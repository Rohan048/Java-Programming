import java.util.Arrays;

public class ArrayMethod {
    public static void main(String[] args) {

        String a[] = { "hello", "welcome", "home", "house" };

        System.out.println("toString() " + Arrays.toString(a)); // only for string
        System.out.println("asList() " + Arrays.asList(a)); // both string and int

        int arr[][] = { { 10, 20 }, { 30, 40 } }; // support multi dimantional array
        System.out.println("deepToString() " + Arrays.deepToString(arr));
    }
}
