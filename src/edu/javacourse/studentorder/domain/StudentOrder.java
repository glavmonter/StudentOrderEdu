package edu.javacourse.studentorder.domain;

import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentOrder {
    private long studentOrderId;
    private String marriageCertificateId;
    private LocalDate marriageDate;
    private String marriageOffice;
    private Adult husband;
    private Adult wife;
    private List<Child> children;

    public long getStudentOrderId() {
        return studentOrderId;
    }

    public void setStudentOrderId(long studentOrderId) {
        this.studentOrderId = studentOrderId;
    }

    public String getMarriageCertificateId() {
        return marriageCertificateId;
    }

    public void setMarriageCertificateId(String marriageCertificateId) {
        this.marriageCertificateId = marriageCertificateId;
    }

    public LocalDate getMarriageDate() {
        return marriageDate;
    }

    public void setMarriageDate(LocalDate marriageDate) {
        this.marriageDate = marriageDate;
    }

    public String getMarriageOffice() {
        return marriageOffice;
    }

    public void setMarriageOffice(String marriageOffice) {
        this.marriageOffice = marriageOffice;
    }

    public Adult getHusband() {
        return husband;
    }

    public void setHusband(Adult husband) {
        this.husband = husband;
    }

    public Adult getWife() {
        return wife;
    }

    public void setWife(Adult wife) {
        this.wife = wife;
    }

    public void addChild(Child child) {
        if(children == null) {
            children = new ArrayList<>(5);
        }
        children.add(child);
    }

    public List<Child> getChildren() {
        return children;
    }
}
