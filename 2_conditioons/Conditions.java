public class Conditions {
    public static void main(String[] args) {
        /*
            arithmatic operator:
            + - * / % 
            ++ -- 
            && || == 
        */


        //------------- if-else -----------
        int x = 10;
        int  y = 10;

        if(x>y){
            System.out.println("if line");
        }
        else if(x==y){
            System.out.println("else if line");
        }
        else{
            System.out.println("else line");
        }

        // ------------ ternary ---------


        // x == y ? System.out.println("Yes"): System.out.println("No"); /?ERROR
        boolean z = x == y? true: false;      // only value can use after '?' which can assing in z
        System.out.println(z);  // true
    }
}
