package com.codegym;

public class Student {
    private String id;
    private String name;
    private String dateOfBirth;
    private String className;


    public Student(String id, String name, String dateOfBirth, String className) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String
    toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
