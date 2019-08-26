
/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */
public class Wks4Solution {
    //-------------- All instance variables -------------------
    private static String[] names = {"AAA", "BBB", "CCC", "DDD"};

    //-------------- All method definitions -------------------
    public static void main(String[] args) {
        printMovie();
        System.out.println();
        printMovie(1, "EEE");
    }

    public static void printMovie() {
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
    }

    public static void printMovie(int rank, String name) {
        System.out.println(rank + ". " + name);
    }
}
