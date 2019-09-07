package tute6;

/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */
public class Movie {
    private String title;
    private int rank;
    private int runTime;
    private Character mainChar;

    public Movie(String title, int rank, int runTime, Character mainChar) {
        this.title = title;
        this.rank = rank;
        this.runTime = runTime;
        this.mainChar = mainChar;
    }

    public String getTitle() {
        return title;
    }

    public int getRank() {
        return rank;
    }

    public int getRunTime() {
        return runTime;
    }

    public Character getMainChar() {
        return new Character(mainChar);
//        return mainChar;  // privacy leak
    }

    public boolean equals(Movie movie) {
        return this.title.equals(movie.title) &&
                this.rank == movie.rank &&
                this.runTime == movie.runTime;
    }

    public String toString() {
        return rank + ". " + title;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o)
//            return true;
//        if (o == null || getClass() != o.getClass())
//            return false;
//        Movie movie = (Movie) o;
//        return rank == movie.rank &&
//                runTime == movie.runTime &&
//                Objects.equals(title, movie.title);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(title, rank, runTime);
//    }
}
