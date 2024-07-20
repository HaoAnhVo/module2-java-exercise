package manage_student_ver1.service.student_service;

import manage_student_ver1.model.Student;

import java.util.ArrayList;

public interface IStudentService {
    ArrayList<Student> findAll();
    void addStudent(Student student);

    void removeStudent(int idStudent);

    Student findStudent(int idStudent);

    void updateStudent(int  idStudent, Student updateStudent);
}
