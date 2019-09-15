package tute7;

/**
 * @author Chuang Wang
 * @studentID 791793
 * @institution University of Melbourne
 */
public class Student {
    private String name;
    private int studentID;
    private String username;
    private Subject[] enrolledSubjects;

    public Student(String name, int studentID, String username) {
        this.name = name;
        this.studentID = studentID;
        this.username = username;
        enrolledSubjects = new Subject[4];
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Subject[] getEnrolledSubjects() {
        return enrolledSubjects.clone();
    }

    public void changeEnrolledSubjectInfo(Subject updatedSubject) {
        for (int i = 0; i < enrolledSubjects.length; i++) {
            if (enrolledSubjects[i].equals(updatedSubject)){
                enrolledSubjects[i] = updatedSubject;
            }
        }
    }
}
