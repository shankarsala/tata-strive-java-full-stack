package yt_new.oop.v13;

import JavaTataStrive.casestudy1.employee.Developer;

public class Developers extends Employee{

    private double projectBonus;

    public Developers() {

    }

    public Developers(String name, int age, double salary, double projectBonus) {
        super(name, age, salary);
        this.projectBonus = projectBonus;
    }

    //polymorphism
    public void salary(){
        double total = projectBonus + salary;
        System.out.println("Total salary: "+total);
    }

    public void salary(double projectBonus){
        System.out.println(projectBonus);
    }

    public void salary(int projectBonus){
        System.out.println(projectBonus);
    }

@Override
public void show(){
    System.out.println("Child class");
}

    public void child(){
        System.out.println("Child class Developer");
    }
}
