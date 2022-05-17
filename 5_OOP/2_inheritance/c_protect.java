class Animal {
    protected String name;
}
  
class Dog extends Animal {
  
    // protect class accesible in subclass
    public void getInfo() {
      System.out.println("name " + name);
    }
}


public class c_protect {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Rocky";

        dog.getInfo(); // name Rocky
    }
}
