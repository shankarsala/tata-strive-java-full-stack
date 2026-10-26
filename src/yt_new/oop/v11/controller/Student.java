package yt_new.oop.v11.controller;

public class Student{
    // Properties/ attributes
    private String name;
    private int age;
    private int rollNo;
    private String address;

    public Student() {
    }

    public Student(String name, int age, int rollNo, String address) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

