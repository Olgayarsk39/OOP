package Work_5.controller;

import Work_5.model.*;
import Work_5.service.DataService;
import Work_5.service.EducationalGroupService;
import Work_5.view.StudentView;

import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView view = new StudentView();
    private EducationalGroupService groupService = new EducationalGroupService();

    public void createStudent(String firstName, String lastName, String middleName){
        service.create(firstName, lastName, middleName, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user:userList){
            Student student = (Student) user;
            view.printOnConsole(student);
        }
    }
    public EducationalGroup createAndReturnEducationalGroup (Teacher teacher, List<Student> studentList){
        return groupService.createEducationalGroup(teacher, studentList);
    }
}
