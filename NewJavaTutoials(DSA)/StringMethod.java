public class StringMethod {
    public static void main(String[] args) {
        
        String a="ROHAN";
        String b="anupam";

        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
        System.out.println(b.concat(a));
        System.out.println(a.length());

        String c="     Rahul      ";
        String d="";
        System.out.println(c.trim());
        System.out.println(d.isEmpty());
       
        System.out.println(a.charAt(2));
        System.out.println(b.indexOf("p"));
        System.out.println(a.replace("R", "M"));
        
        System.out.println(b.equals(a));
    }
}
