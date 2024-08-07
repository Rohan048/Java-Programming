public class StringComparasion {
    public static void main(String[] args) {
        String a = "Rohan";
        String b = "Rohan";

        /* only depends upon String data when you are use string literal */
        // if (a == b) {
        // System.out.println("True");
        // } else {
        // System.out.println("false");
        // }

        String c = "Rahul";
        String d = new String("Rahul");

        /* only depends upon String Variable when you are use new keyword */
        // if (c == d) {
        //     System.out.println("True");
        // } else {
        //     System.out.println("false");
        // }

        /* only depends upon String data when you are use new keyword */
        if (c.equals(d)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
