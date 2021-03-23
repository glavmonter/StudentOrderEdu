package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.Adress;
import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.Child;
import edu.javacourse.studentorder.domain.StudentOrder;

import java.time.LocalDate;

public class SaveStudentOrder {
    public static void main(String[] args) {

        buildStudentOrder(10);

        //        StudentOrder so = new StudentOrder();
//        long ans = saveStudentOrder(so);
//        System.out.println(ans);

       // buildStudentOrder();
    }

    static long saveStudentOrder(StudentOrder studentOrder){
        long answer = 199;
        System.out.println("saveStudentOrder");

        return answer;
    }

    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);
        so.setMarriageCertificateId("" + (123456000 + id));
        so.setMarriageDate(LocalDate.of(2020, 7, 4));
        so.setMarriageOffice("отдел ЗАГС");

        Adress adress = new Adress("141401", "ул. Победы", "6/20", "", "24");

        //Муж
        Adult husband = new Adult("Пашинцев", "Артем", "Игоревич", LocalDate.of(1992, 3, 19));
        husband.setPassportSeria("" + (1000 + id));
        husband.setPassportNumber("" + (100000 + id));
        husband.setIssueDate(LocalDate.of(2015, 5, 5));
        husband.setIssueDepartment("Отдел полиции №" + id);
        husband.setStudentId("" + (10000 + id));
        husband.setAdress(adress);

        //жена
        Adult wife = new Adult("Пашинцева", "Алена", "Николаевна", LocalDate.of(1992,4,4));
        wife.setPassportSeria("" + (2000 + id));
        wife.setPassportNumber("" + (200000 + id));
        wife.setIssueDate(LocalDate.of(2015, 5, 5));
        wife.setIssueDepartment("Отдел полиции №" + id);
        wife.setStudentId("" + (20000 + id));
        wife.setAdress(adress);

        //ребенок1
        Child child1 = new Child("Пашинцева", "Вероника", "Артемовна", LocalDate.of(2021,11,25));
        child1.setCertificateNumber("" + (300000 + id));
        child1.setIssueDate(LocalDate.of(2021,12,5));
        child1.setIssueDepartment("Отдел ЗАГС №" + id);
        child1.setAdress(adress);

        //ребенок2
        Child child2 = new Child("Пашинцева", "Изабелла", "Артемовна", LocalDate.of(2021,11,25));
        child2.setCertificateNumber("" + (400000 + id));
        child2.setIssueDate(LocalDate.of(2021,12,5));
        child2.setIssueDepartment("Отдел ЗАГС №" + id);
        child2.setAdress(adress);

        so.setHusband(husband);
        so.setWife(wife);
        so.addChild(child1);
        so.addChild(child2);
        return so;
    }

    static void printStudentOrder(StudentOrder stOr) {
        System.out.println(stOr.getStudentOrderId());
    }
}
