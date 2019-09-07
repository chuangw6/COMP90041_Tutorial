package tute6;

/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */
public class CinemaDemo {
    public static void main(String[] args) {
        Character mainChar = new Character("character", "Jone", 1, "Sample");

        Movie movie1 = new Movie("Sample", 1, 120, mainChar);

        movie1.getMainChar().setActorName("Frank"); // potential privacy leak

        System.out.println(movie1.getMainChar().getActorName());
    }
}
