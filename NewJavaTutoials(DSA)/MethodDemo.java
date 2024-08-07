/* Method works based on stack method (last inn fast out)
  method -- 2 type
 * 1. static method- direct call with class name and static
 * method contain only static variable.  ex- class_name.Method_name()
 */
//  public class MethodDemo {
//     public static void main(String[] args) {
//         MethodDemo m = new MethodDemo();
//         m.Disp();
//         MethodDemo.add();
//     }

//     void Disp() {
//         System.out.println("Rohan Rai");
//     }

//    static void add()
//     {
//         int a=10,b=20;
//         System.out.println(a+b);
//     }
// }

/* 
 * 2. Non static method- call with Reference of class object and Non static method contain 
 * static and instance (Both) variable.
 * Ex- class_name ref=new class_name
 *      ref.method_name()
 */
// public class MethodDemo {
//     public static void main(String[] args) {
//         MethodDemo m = new MethodDemo();
//         m.Disp();
//         m.add();
//         m.add();
//         m.add();
//         m.add();
//     }

//     void Disp() {
//         System.out.println("Rohan Rai");
//     }

//     void add()
//     {
//         int a=10,b=20;
//         System.out.println(a+b);
//     }
// }
