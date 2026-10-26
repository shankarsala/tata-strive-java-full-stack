package JavaTataStrive.Aggregation;

/*
 * JavaTataStrive.Aggregation in Java
 * JavaTataStrive.Aggregation represents a HAS-A Relationship between two classes.
 * JavaTataStrive.Aggregation is a special type of association where one class contains the reference of another class.
 * ex: Learner Has-a laptop
 * Batch Has-A learner
 * Trainer has-course
 * JavaTataStrive.Aggregation is achieved using object reference.
 * one class contains another class object
 * aggregation is different from inheritance.
 * inheritance -> IS-A
 *  JavaTataStrive.Aggregation -> HAS-A
 * Loose coupling
 *
 *
 * */


class Laptop
{
    String brand;
    Laptop(String brand)
    {
        this.brand=brand;
    }
}

class Learner
{
    String learnerName;
     Laptop l1;

     public Learner(String learnerName, Laptop l1) {
         this.learnerName = learnerName;
         this.l1 = l1;
     }
     void display()
     {
             System.out.println("Learner name: "+learnerName);
             System.out.println("Laptop Brand: "+l1.brand);
         }


}

public class Aggr1 {
    static void main(String[] args) {
        Laptop ll1 = new Laptop("Dell");
        Learner ll2 = new Learner("Shankar",ll1);
        ll2.display();
    }

}
