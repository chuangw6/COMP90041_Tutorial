package tute5;

import java.util.Objects;

/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */
public class Movie {
    private String title;
    private int rank;
    private int runTime;

    public Movie(String title, int rank, int runTime) {
        this.title = title;
        this.rank = rank;
        this.runTime = runTime;
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

    @Override
    public String toString() {
        return rank + ". " + title;
    }

//    public boolean equals(Movie otherMovie) {
//        return this.title.equals(otherMovie.title) &&
//                this.rank == otherMovie.rank &&
//                this.runTime == otherMovie.runTime;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Movie movie = (Movie) o;
        return rank == movie.rank &&
                runTime == movie.runTime &&
                Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, rank, runTime);
    }
}
