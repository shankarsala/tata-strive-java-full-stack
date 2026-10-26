package yt_new.oop.v14;

public class Hr extends Employee{

    public Hr(int id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("Hiring the people");
    }
}
