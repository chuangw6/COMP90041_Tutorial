package tute7;

/**
 * @author Chuang Wang
 * @studentID 791793
 * @institution University of Melbourne
 */
public class Subject {
    private String code;
    private String title;
    private String coordinator;

    public Subject(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        // also change the subject recorded by that Student object - TBD
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        // also change the subject recorded by that Student object - TBD
        this.title = title;
    }

    public String getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(String coordinator) {
        // also change the subject recorded by that Student object - TBD
        this.coordinator = coordinator;
    }
}
