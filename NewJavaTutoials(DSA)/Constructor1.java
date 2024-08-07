// Default Constuctor
class B {
    int a;
    String b;
    boolean c;

    B() {
        a = 1000;
        b = "Rohan";
        c = false;
    }

    void Disp() {
        System.out.println(a + " " + b + " " + c);
    }
}

class Constructor1 {
    public static void main(String[] args) {
        B sc = new B();
        sc.Disp();
    }
}  