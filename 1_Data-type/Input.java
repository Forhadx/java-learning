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
