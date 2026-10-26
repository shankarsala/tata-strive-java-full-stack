package yt_new.oop.v12.inheritance;

import JavaTataStrive.casestudy1.employee.Developer;

public class Developers extends Employee{

    private double projectBonus;


    public Developers(String name, int age, double salary, double projectBonus) {
        super(name, age, salary);
        this.projectBonus = projectBonus;
    }

    public void salary(){
        double total = projectBonus + salary;
        System.out.println("Total salary: "+total);
    }




    public void child(){
        System.out.println("Child class Developer");
    }
}
