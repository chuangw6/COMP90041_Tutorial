
import java.util.Arrays;
/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */
public class Hmw4Solution {
    //-------------- All instance variables -------------------
    private static String[] names = {"AAA", "BBB", "CCC", "DDD"};

    //-------------- All method definitions -------------------
    public static void main(String[] args) {
        System.out.println(isAFavourite("BB"));
        printMovie("The Avengers,Iron Man,Thor");
    }

    public static void printMovie() {
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
    }

    public static void printMovie(int rank, String name) {
        System.out.println(rank + ". " + name);
    }


    public static boolean isAFavourite(String name){
        String list = Arrays.toString(names);
        return list.contains(name);
    }

    public static void printMovie(String movies) {
        String[] list = movies.split(",");
        for (String s : list){
            System.out.println(s);
        }
    }

}
