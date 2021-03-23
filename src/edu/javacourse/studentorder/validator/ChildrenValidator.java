package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.children.AnswerChildren;
import edu.javacourse.studentorder.domain.StudentOrder;

public class ChildrenValidator {

    public String hostName;
    String login;
    String password;

    public AnswerChildren checkChildren(StudentOrder so){
        System.out.println("Children check is running:"
                + hostName + "," + login + "," + password);
        AnswerChildren children = new AnswerChildren();
        children.success = false;
        return children;
    }
}
