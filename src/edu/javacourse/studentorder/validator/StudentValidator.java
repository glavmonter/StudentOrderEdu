package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.student.AnswerStudent;
import edu.javacourse.studentorder.domain.StudentOrder;

public class StudentValidator {


    public String hostName;
    String login;
    String password;

    public AnswerStudent checkStudent(StudentOrder so){
        System.out.println("Student check is running:"
                + hostName + "," + login + "," + password);
        AnswerStudent stud = new AnswerStudent();
        stud.success = false;
        return stud;
    }
}
