package tute5;

/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */
public class Character {
    private String characterName;
    private String actorName;
    private int rating;
    private String movieName;
    private Movie movie;

    public Character(String characterName, String actorName, Movie movie) {
        this.characterName = characterName;
        this.actorName = actorName;
        this.movie = movie;
        this.rating = movie.getRank();
        this.movieName = movie.getTitle();
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

    public Movie getMovie() {
        return movie;
    }
}
