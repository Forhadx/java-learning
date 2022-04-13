import javax.print.DocFlavor.STRING;

public class Strings {
    public static void main(String[] args) {
        //------- CHARACTER ----
        char c1 = 'a';
        // chart c2 = 'ab'; // give error
        
        char c3 = '\u00A7'; // java support unicode
        System.out.println("character: "+c3);   // character: ?


        //------- STRING ----
        String str1 = "hello world";
        String str2 = "Hey: \u00A7";    // use unicode on string
        String str3 = new String("another process");

        // calculation - string make int in string
        String x = "10";
        String y = "15";
        int z = 10;

        System.out.println(x+z);    // 1010
        System.out.println(x+y);    // 1015
        System.out.println(x+7+y);  // 10715
    }
}
