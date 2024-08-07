//Parameterized Constuctor
class Constrctor2 {
    public static void main(String[] args) {
        B sc=new B(100, 200);
        sc.show();
    }
}

class B{
    int x,y;
    B(int a,int b){
        x=a; y=b;
    }
    void show(){
        System.out.println(x+" "+y);
    }
}