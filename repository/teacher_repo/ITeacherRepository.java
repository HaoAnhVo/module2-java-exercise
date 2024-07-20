package manage_student_ver1.repository.teacher_repo;

import manage_student_ver1.model.Teacher;

import java.util.ArrayList;

public interface ITeacherRepository {
    ArrayList<Teacher> findAll();

    void addTeacher(Teacher teacher);
    void removeTeacher(int idTeacher);

    Teacher findTeacher(int idTeacher);

    void updateTeacher(int idTeacher, Teacher teacher);
}
