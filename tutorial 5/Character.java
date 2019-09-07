package tute5;

/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */
public class Character {
    private final String characterName;
    private final String actorName;
    private final int rating;
    private final String movieName;

    public Character(String characterName, String actorName, int rating, String movieName) {
        this.characterName = characterName;
        this.actorName = actorName;
        this.rating = rating;
        this.movieName = movieName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public String getActorName() {
        return actorName;
    }

    public int getRating() {
        return rating;
    }

    public String getMovieName() {
        return movieName;
    }


}
