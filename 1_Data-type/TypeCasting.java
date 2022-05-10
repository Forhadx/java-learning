public class TypeCasting {
    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double

        int x = 10;
        // short y = x; // error
        short y = (short)x;
        short z = (byte)x;

        double d = 12.22;
        // float f = d; // error
        float f = (float) d;
        double d2 = f; // directly assing


        // int to string
        int a = 12123;
        System.out.println(Integer.toString(a));


        // char to int
        char c1 = '2';
        System.out.println(Character.getNumericValue(c1));

        // char to string 
        char m = 'm';
        char n = 'n';

        String sm = "" + m;
        String smn = "" + m + n;


        // char array to string
        char[] arr = { 'p', 'q', 'r', 's' };
        String str = String.valueOf(arr);
        System.out.println(str);

        
    }    
}
