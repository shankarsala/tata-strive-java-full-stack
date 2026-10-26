package JavaTataStrive.Extra.basic_code.com;
import JavaTataStrive.basic_code.access_modifier.Animal;
public class Dog extends Animal {
    void bark() {
        sound();
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
    }

}
