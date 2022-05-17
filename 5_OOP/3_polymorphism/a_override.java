class Animal {
    public void eat() {
      System.out.println("Animal..");
    }
  }
  

  // Dog inherits Animal
  class Dog extends Animal {

    @Override // overriding the eat() method
    public void eat() {
      System.out.println("Dog...");
    }
  
    // new method in subclass
    public void bark() {
      System.out.println("I can bark");
    }
  }

public class b_override {
    public static void main(String[] args) {
        Dog dog = new Dog();

        // call the eat() method
        dog.eat(); // Dog...
        dog.bark(); // I can bark
    }
}
