package yt_new.oop.v10;

public class ClassAndObjects {
    public static void main(String[] args){
        Student obj = new Student("Shankar",22,123,"Mumbai");
//        obj.input("Shankar",22,123,"Mumbai");
        obj.show();
    }
}


class Student{
    // Properties
    private String name;
    private int age;
    private int rollNo;
    private String address;

    public Student(String name, int age, int rollNo, String address){
       this.name = name;
       this.age = age;
       this.rollNo=rollNo;
       this.address=address;
    }

    //input by method
  /*  public void input(String n, int a, int r, String add){
        name=n;
        age=a;
        rollNo=r;
        address=add;
    }*/

    //output
    public void show(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
        System.out.println("Roll No: "+rollNo);
    }

}