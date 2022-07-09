interface AnimalEat{
    void eat();
}

interface AnimanTravel{
    void travel(String name);
}

class Cat implements AnimalEat {
    public void eat(){
        System.out.println("Cat eat!");
    }
}

// multilevel inheritance
class Horses implements AnimalEat, AnimanTravel{
    public void eat(){
        System.out.println("Horses eat!");
    }

    public void travel(String name){
        System.out.println(name+ " Horses Travel!");
    }
}


public class a_interface {
    public static void main(String[] args){
        Horses h = new Horses();
        h.travel("Black");
        h.eat();

        Cat c = new Cat();
        c.eat();
    }
}
