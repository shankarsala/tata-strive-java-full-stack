package yt_new.oop.v14;

public class Developer extends  Employee implements ConductMeeting{
    public Developer(int id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("Developer is Coding");
    }

    @Override
    public void conductMeeting() {
        System.out.println("Developer Conducting meeting");
    }
}
