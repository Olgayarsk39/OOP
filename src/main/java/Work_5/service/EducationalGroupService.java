package Work_5.service;

import Work_5.model.EducationalGroup;
import Work_5.model.Student;
import Work_5.model.Teacher;

import java.util.List;

public class EducationalGroupService {

    public EducationalGroup createEducationalGroup(Teacher teacher, List<Student> studentList){
        return new EducationalGroup(teacher, studentList);
    }
}
