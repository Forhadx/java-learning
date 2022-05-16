import java.util.HashSet;
import java.util.Set;

public class h_Set {
    public static void main(String[] args) {
        // hashset 
        Set<Character> ch = new HashSet<>();
        ch.add('n');
        ch.add('b');
        ch.add('a');
        ch.add('n');
        ch.add('a');
    
        // output order may change time to time
        System.out.println(ch); //[a, b, n]

        System.out.println(ch.contains('n')); // true
        System.out.println(ch.contains('x')); // false


    }    
}
