package users;

public class IndividualUser extends User {
    int studentId;

    public IndividualUser(String email, String displayName) {
        super(email, displayName);
    }

    public IndividualUser(String email, String displayName, int studentId) {
        super(email, displayName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + studentId;
    }
}
