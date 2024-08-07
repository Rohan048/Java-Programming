public class StringReverse {
    public static void main(String[] args) {
        // type -1
        // StringBuffer s = new StringBuffer("Rohan Rai");
        // StringBuilder sc = new StringBuilder("Rahul Rai");

        // System.out.println(s.reverse());
        // System.out.println(sc.reverse());

        // type-2
        int l;
        String a = "RohanRai";
        String b = "";
        l = a.length();

        for (int i = l - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        System.out.println(b);

    }
}
