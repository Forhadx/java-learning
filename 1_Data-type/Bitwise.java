
public class Bitwise {
    public static void main(String[] args) {
        int a = 15; // 0000 1111
        int b = 27; // 0001 1011

        //AND
        System.out.println(a&b); // 11 = 0000 1011

        // OR
        System.out.println(a|b); // 31 = 0001 1111

        // XOR
        System.out.println(a^b); // 20 = 0001 0100

        // complement
        System.out.println(~a); // -16 = 0001 0000

        // right shift
        System.out.println(a>>2); // 3 = 0000 0011

        // left shitf 
        System.out.println(a<<2); // 60 = 0011 0110

    }    
}
