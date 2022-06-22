import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class e_List {
    public static void main(String[] args) {
        // first access - use arraylist
        List<String> arrList = new ArrayList<>();
        arrList.add("aa");
        arrList.add("bb");
        arrList.add("cc");
        System.out.println(arrList); // [aa, bb, cc]


        // first operation, multiple operation - use linkedlist
        List<String> linkList = new LinkedList<>();
        linkList.add("one");
        linkList.add("two");
        linkList.add("three");
        System.out.println(linkList); // [one, two, three]


    }
}
