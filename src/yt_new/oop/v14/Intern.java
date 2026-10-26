package yt_new.oop.v14;

public class Intern extends  Employee{

    public Intern(int id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("Intern is learning");
    }
}
