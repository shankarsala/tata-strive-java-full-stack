package yt_new.oop.v14;

public abstract class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }



    public void login(){
        System.out.println(name+ "is Login");
    }

    public void logout(){
        System.out.println(name+"is logout");
    }

  /*  public void work(){
        System.out.println("writing code");
    }*/

    public abstract void work();
}
