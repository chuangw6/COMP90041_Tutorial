package tute6.demo;

/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */


public class Player {
    private final String firstName;
    private final String lastName;
    private final int score;

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getScore() {
        return score;
    }
}
