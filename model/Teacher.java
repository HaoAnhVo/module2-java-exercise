package manage_student_ver1.model;


public class Teacher extends Person implements ITeacher{
    private String level;
    private String subject;

    public Teacher(int id, String name, String email, int age, String level, String subject) {
        super(id, name, email, age);
        this.level = level;
        this.subject = subject;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString() + ", level: " + level + ", subject: " + subject;
    }

    @Override
    public String getSubjectToTeach() {
        return subject;
    }

    @Override
    public void setSubjectToTeach(String subject) {
        this.subject = subject;
    }
}
