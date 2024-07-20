package manage_student_ver1.service.teacher_service;

import manage_student_ver1.model.Teacher;
import manage_student_ver1.repository.teacher_repo.ITeacherRepository;
import manage_student_ver1.repository.teacher_repo.TeacherRepository;

import java.util.ArrayList;

public class TeacherService implements ITeacherService {

    private final ITeacherRepository iTeacherRepository = new TeacherRepository();

    @Override
    public ArrayList<Teacher> findAll() {
        return iTeacherRepository.findAll();
    }


    @Override
    public void addTeacher(Teacher teacher) {
        iTeacherRepository.addTeacher(teacher);
    }

    @Override
    public void removeTeacher(int idTeacher) {
        iTeacherRepository.removeTeacher(idTeacher);
    }

    @Override
    public Teacher findTeacher(int idTeacher) {
        return iTeacherRepository.findTeacher(idTeacher);
    }

    @Override
    public void updateTeacher(int idTeacher, Teacher updateTeacher) {
        iTeacherRepository.updateTeacher(idTeacher, updateTeacher);
    }


}
