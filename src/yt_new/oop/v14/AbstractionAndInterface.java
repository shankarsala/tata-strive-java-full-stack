package yt_new.oop.v14;

public class AbstractionAndInterface {
    public static void main(String[] args) {
      Developer d = new Developer(12,"shankar",4000);
      d.login();
      d.conductMeeting();


      Manager m = new Manager(121,"Rahul",5000);
        m.login();
        m.conductMeeting();
        m.leave();


    }
}
