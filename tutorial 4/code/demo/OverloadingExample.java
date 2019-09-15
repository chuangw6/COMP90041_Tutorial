

/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */
public class OverloadingExample {
    private static int sumOf(int a, int b) {
        return a + b;
    }

    static int sumOf(int a, int b, int c) {
        return a + b + c;
    }

    static double sumOf(double a, double b) {
        return a + b;
    }

    private static double sumOf(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sumOf(1, 2));
        System.out.println(sumOf(10.5, 20.6, 30.7));
    }
}
