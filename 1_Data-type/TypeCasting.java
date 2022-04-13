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
        
    }    
}
