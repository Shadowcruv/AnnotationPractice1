package com.anotate;

//@Component
public class School {

    private String schoolName;

    private int establishedDate;

    private Person person;

    public School(){

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getEstablishedDate() {
        return establishedDate;
    }

    public void setEstablishedDate(int establishedDate) {
        this.establishedDate = establishedDate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
