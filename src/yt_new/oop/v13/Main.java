package yt_new.oop.v13;



public class Main {
   public static void main(String[] args) {
/*
     Developers d = new Developers("Shankar",22, 40000, 1000);
     d.salary();
*/

       //runtime polymorphism
       Employee obj = new Developers();
       obj.show(); // by these we can access parent class
                  // but not child class so the obj is parent class

       /*
        compile time check parent reference
        and during execution child class check by jvm
       */

       //compile time polymorphism
       /*Developers d = new Developers();
       d.salary(30000);
       d.show();*/
   }
}
