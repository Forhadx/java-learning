
class Animal {
    public String name;

    public Animal(String name){
        this.name = name;
    }

    public void eat() {
      System.out.println("Animal...");
    }
  }
  

  // Dog inherits Animal
  class Dog extends Animal {
    int age;
    
    public Dog(String name, int age){
        super(name);
        this.age = age;
    }

    @Override
    public void eat() {
      super.eat();  
      System.out.println("Dog..."); 
    }
  
    // new method in subclass
    public void show() {
      System.out.println("name: "+name+" ,Age: "+age);
    }
  }


public class c_super {
    public static void main(String[] args) {
        Dog labrador = new Dog("roki", 2);

    // call the eat() method
    labrador.eat();
    labrador.show(); 
    }
}


/*

Animal...
Dog...
name: roki ,Age: 2

*/