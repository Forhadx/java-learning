/*
    - type
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Character> ch = new ArrayList<>();
        ArrayList<Double> d = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();
        ArrayList<Float> f= new ArrayList<>();

    - functions:
        arr.add(new_value)
        arr.get(array_value)
        arr.set(index, new_value)
        arr.indexOf(array_value)
        arr.remove(array_value_OR_array_index)

*/


import java.util.ArrayList;

public class a_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>();

        //========== ADD - value in str list
        str.add("shamsul");
        str.add("haque");
        str.add("forhad");




        //========= DISPLAY
        System.out.println(str);    // [shamsul, haque, forhad]

        for(String s: str){
            System.out.println(s); // [shamsul, haque, forhad]
        }
        
        // GET
        // System.out.println(str[0]); // not supported
        System.out.println(str.get(2)); // forhad



        //========= Update str by index 
        // str.set(index, new_value)

        str.set(0, "alal");
        System.out.println(str); // [alal, haque, forhad]


        //====== find value by index
        int x = str.indexOf("forhad"); 
        System.out.println(x);  // 2
        x = str.indexOf("hi");
        System.out.println(x); // -1 , ho value "hi" is in array


        
        //======== REMOVE - first try to delete by index then by value
        str.remove(1);      // remove by index
        str.remove("alal");  // remove by value

        System.out.println(str);   //[forhad]

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.remove(1);
        System.out.println(arr); //[2, 1]

        ArrayList<Float> f= new ArrayList<>();
        f.add(23.23f);

        int a = arr.indexOf(2);
        System.out.println(a);  // 0
    }
}
