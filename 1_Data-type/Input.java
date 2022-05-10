import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.next();
        System.out.println("name: "+name);
        
        int intNum = input.nextInt();
        System.out.println("Int number: "+ intNum);
        
        float floatNum = input.nextFloat();
        System.out.println("float number: "+ floatNum);

        double doulbeNum = input.nextDouble();
        System.out.println("float number: "+ doulbeNum);

    }
}


/*
    nextBoolean()	Reads a boolean value from the user
    nextByte()	    Reads a byte value from the user
    nextDouble()	Reads a double value from the user
    nextFloat()	    Reads a float value from the user
    nextInt()	    Reads a int value from the user
    nextLine()	    Reads a String value from the user
    nextLong()	    Reads a long value from the user
    nextShort()	    Reads a short value from the user
*/