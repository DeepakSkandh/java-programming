public class StringOne {
    public static void main(String[] args ){
        String a = "hi";
        String b = new String("hi");
        System.out.println(a == b); // false - different objects
        System.out.println(a.equals(b)); // true
    }
}