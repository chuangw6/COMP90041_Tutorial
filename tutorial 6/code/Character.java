package tute6;

/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */
public class Character {
    private String characterName;
    private String actorName;
    private int rating;
    private String movieName;

    public Character(String characterName, String actorName, int rating, String movieName) {
        this.characterName = characterName;
        this.actorName = actorName;
        this.rating = rating;
        this.movieName = movieName;
    }

    public Character(Character original) {
        if (original == null) {
            System.out.println("Fatal error.");
            System.exit(0);
        }
        this.characterName = original.characterName;
        this.actorName = original.actorName;
        this.rating = original.rating;
        this.movieName = original.movieName;

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

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
