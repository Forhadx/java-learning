

class Person{
    private String name;
    private int age;

    // make this default constructor other with next constructor not working.
    public Person(){}

    public Person(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

public class app {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setName("forhad");
        System.out.println(obj.getName());   // forhad

        Person obj2 = new Person(25);
        int userAge = obj2.getAge();
        System.out.println(userAge);   // 25
    }
}
