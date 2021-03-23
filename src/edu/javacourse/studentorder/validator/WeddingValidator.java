package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.wedding.AnswerWedding;
import edu.javacourse.studentorder.domain.StudentOrder;

public class WeddingValidator {

    public String hostName;
    String login;
    String password;

    public AnswerWedding checkWedding(StudentOrder so){
        System.out.println("Wedding check is running:"
                + hostName + "," + login + "," + password);
        AnswerWedding wed = new AnswerWedding();
        wed.success = false;
        return wed;
    }
}
