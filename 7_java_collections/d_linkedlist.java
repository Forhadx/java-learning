/*
    - arr.add(value)
    - arr.add(index, value)
    - arr.set(index, up_value)
    - arr.remove()
    - arr.remove(index)

*/

import java.util.LinkedList;

public class d_linkedlist {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        // ADD
        names.add("forhad");
        names.add("shamsul");
        names.add("roni");

        // ADD by index
        names.add(1,"ratul");
        System.out.println(names);  // [forhad, ratul, shamsul, roni]
    
        // update
        names.set(1, "Raton");
        System.out.println(names);  // [forhad, Raton, shamsul, roni]

        // delete
        names.remove(); // delete 1st index value
        System.out.println(names);  // [Raton, shamsul, roni]
        
        // delete by index
        names.remove(1);
        System.out.println(names);  // [Raton, roni]
    }   
}
