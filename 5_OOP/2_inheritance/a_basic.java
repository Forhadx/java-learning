
class Animal {
    String name;

    public void eat() {
      System.out.println("I can eat");
    }
}
  
// inherit from Animal
class Dog extends Animal {
  
    // new method in subclass
    public void display() {
      System.out.println("My name is " + name);
    }
}

public class a_basic {
    public static void main(String[] args){
        Dog dog = new Dog();

        // access field of superclass
        dog.name = "Rohu";
        dog.display(); // My name is Rohu
    
        // call method of superclass
        dog.eat(); // I can eat
    }
}
