package JavaTataStrive.basic_code.com;

//child class
public class Employee extends  Student {
    public Employee(){
        System.out.println("Employee Constructor.........!!");

    }

    public void display(){
        super.display();
        System.out.println("welcome to ABCE company......");
        super.display();
    }
}
