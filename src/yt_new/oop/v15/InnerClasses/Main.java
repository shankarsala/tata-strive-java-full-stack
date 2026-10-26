package yt_new.oop.v15.InnerClasses;

/*class A{
    public void display(){
        System.out.println("code");
    }

    static class B{
        public void show(){
            System.out.println("Shankar");
        }
    }
}

public class Main {
    public static void main(String[] args) {
      A obj = new A();
      obj.display();
//     A.B obj2 =obj.new B();
//     obj2.show();
      A.B obj3 = new A.B();
    }
}*/

//Anonymous
/*class A{
    public void display(){
        System.out.println("Code");
    }
}

public class Main{
    public static void main(String[] args) {
        A obj = new A(){
            public void display(){
                System.out.println("Shankar");
            }
        };
        obj.display();
    }
}*/

//interface
interface A{
    public void display();
}

public class Main{
    public static void main(String[] args) {
        A obj = new A(){
            public void display(){
                System.out.println("Shankar");
            }
        };
        obj.display();
    }
}
