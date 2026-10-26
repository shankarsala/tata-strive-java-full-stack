package JavaTataStrive.Extra.basic_code.com;

import JavaTataStrive.basic_code.com.Student;

public class Employee extends Student {
    Employee(){
        super();
        System.out.println("Employee Constructor....");
    }
    public void display(){
        super.display();
        System.out.println("Welcome to TATA Company");
    }
}
