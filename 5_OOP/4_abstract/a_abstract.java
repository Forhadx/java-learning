
// abstract class
abstract class Animal{
    //abstract method
    abstract void display();

    public void eat(){
        System.out.println("eating...");
    }
}

class Dog extends Animal{
    public void display(){
        System.out.println("hi");
    }
}

public class a_abstract {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        dog.display(); // hi

        dog.eat(); // eating...

    }
}
