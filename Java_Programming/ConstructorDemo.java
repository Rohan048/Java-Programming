public class ConstructorDemo {
    public static void main(String[] args) {
        B sc = new B();
        sc.show();
    }
}

class B {
    int a;
    String b;

    B() {
        a = 0;
        b = null;
    }

    void show() {
        System.out.println(a + " " + b);
    }
}