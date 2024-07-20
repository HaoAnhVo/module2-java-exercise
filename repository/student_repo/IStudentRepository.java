package manage_student_ver1.repository.student_repo;

import manage_student_ver1.model.Student;

import java.util.ArrayList;

public interface IStudentRepository {
    ArrayList<Student> findAll();

    void addStudent(Student student);
    void removeStudent(int idStudent);

    Student findStudent(int idStudent);

    void updateStudent(int idStudent, Student student);
}
