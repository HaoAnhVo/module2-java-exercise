package manage_student_ver1.service.student_service;

import manage_student_ver1.model.Student;
import manage_student_ver1.repository.student_repo.IStudentRepository;
import manage_student_ver1.repository.student_repo.StudentRepository;

import java.util.ArrayList;

public class StudentService implements IStudentService {

    private final IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public ArrayList<Student> findAll() {
        return iStudentRepository.findAll();
    }


    @Override
    public void addStudent(Student student) {
        iStudentRepository.addStudent(student);
    }

    @Override
    public void removeStudent(int idStudent) {
        iStudentRepository.removeStudent(idStudent);
    }

    @Override
    public Student findStudent(int idStudent) {
        return iStudentRepository.findStudent(idStudent);
    }

    @Override
    public void updateStudent(int idStudent, Student updateStudent) {
        iStudentRepository.updateStudent(idStudent, updateStudent);
    }


}
