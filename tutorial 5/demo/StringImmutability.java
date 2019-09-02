package tute5.demo;

/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */
public class StringImmutability {
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "cat";
        String s3 = new String("cat");
        String s4 = new String("cat");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // true

        System.out.println(s1.equals(s3)); // true
        System.out.println(s1 == s3); // false

        System.out.println(s3.equals(s4)); // true
        System.out.println(s3 == s4); // false

        String b1 = "hello";
        System.out.println(b1.concat(" frank")); // hello frank
        System.out.println(b1); // hello
        System.out.println(b1 + " frank"); // hello frank

    }
}
