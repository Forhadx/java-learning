/*  
    - return type void, int, double
    - method overloading
*/


public class Method {
    public static void main(String[] args) {
        // void method
        show(); // method running...


        // return type double
        double x = area(10, 20);
        System.out.println("Rectangle area: "+x); // Rectangle area: 200.0


        // return type double and ** METHOD OVERLOADING **
        int y = area(15);
        System.out.println("Square area: "+ y); // Square area: 225
    }

    
    public static void show() {
            System.out.println("method running...");
    }

    public static double area(int h, int w) {
        return h*w;
    }

    public static int area(int l) {
        return l*l;
    }
}
