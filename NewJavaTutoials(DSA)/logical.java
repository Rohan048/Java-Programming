// lecture-23

public class logical {
    public static void main(String[] args) {
        System.out.println("logical AND");
        System.out.println((10 > 5) && (2 > 4));
        System.out.println((2 > 3) && (3 < 4));

        System.out.println("logical OR");
        System.out.println((10 > 5) || (2 > 8));
        System.out.println((4 > 3) || (3 < 8));

        System.out.println("logical NOT");
        System.out.println(!(10 > 5));
        System.out.println(!(2 < 8));

    }
}
