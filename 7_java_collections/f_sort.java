/*
    - Collections.reverse(arr);
    - arr.sort(null)
    - Collections.sort(arr);
*/

import java.util.ArrayList;
import java.util.Collections;

public class f_sort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(23);
        arr.add(11);
        arr.add(8);
        arr.add(40);
        arr.add(16);

        // display
        System.out.println(arr);    // [23, 11, 8, 40, 16]

        // revers()
        Collections.reverse(arr);
        System.out.println(arr);    // [16, 40, 8, 11, 23]

        // sorting
        arr.sort(null);
        System.out.println(arr); // [8, 11, 16, 23, 40]

        Collections.sort(arr);
        System.out.println(arr); // [8, 11, 16, 23, 40]
    }
}
