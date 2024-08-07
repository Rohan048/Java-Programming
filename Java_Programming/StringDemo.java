/*In java string is a object and contain alpha numeric value 
 * Note-1. String are immutable in java
 * 2. it contain method 
 * 3. concat(), equal(), toUpperCase(),toLowerCase()
 * 4. type 2: (a). String literal-(store krta h string const.pool me jo subMemory h heap memory ka)
 *  (b). new keyword-(store krta h heap memory me)
 */


// public class StringDemo {
//     public static void main(String[] args) {
//         String a="Rohan"; //literal
//         System.out.println(a);

//         String b="Rohan"; //literal
//         System.out.println(b);

//         a=a.concat("Rai"); //jabardasti hua h print, kyuki string immutable h na yar
//         System.out.println(a);
//     }
// }



public class StringDemo {
    public static void main(String[] args) {
        String a=new String("Rohan");
        System.out.println(a);

        String b=new String("Rohan");
        System.out.println(b);

        a=a.concat("Rai");  //jabardasti hua h print, kyuki string immutable h na yar
        System.out.println(a);
    }
    
}