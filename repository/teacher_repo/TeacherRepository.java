package manage_student_ver1.repository.teacher_repo;

import manage_student_ver1.model.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherRepository implements ITeacherRepository {
    private static final ArrayList<Teacher> teachers;

    private static final Scanner sc;

    static {
        sc = new Scanner(System.in);
        teachers = new ArrayList<>();
    }

    @Override
    public ArrayList<Teacher> findAll() {
        return teachers;
    }


    @Override
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        System.out.println("Thêm mới giảng viên thành công!");
    }

    @Override
    public void removeTeacher(int idTeacher) {
        teachers.removeIf(teacher -> teacher.getId() == idTeacher);
        System.out.println("Xóa giảng viên thành công!");
    }

    @Override
    public Teacher findTeacher(int idTeacher) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == idTeacher) {
                return teacher;
            }
        }
        return null;
    }

    @Override
    public void updateTeacher(int idTeacher, Teacher updateTeacher) {
        Teacher teacher = findTeacher(idTeacher);
        teacher.setName(updateTeacher.getName());
        teacher.setAge(updateTeacher.getAge());
        teacher.setEmail(updateTeacher.getEmail());
        teacher.setLevel(updateTeacher.getLevel());
        teacher.setSubjectToTeach(updateTeacher.getSubjectToTeach());
        System.out.println("Thông tin giảng viên đã được cập nhật: " + teacher);
    }
}
