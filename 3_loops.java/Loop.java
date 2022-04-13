/**
    - switch
    - for
    - while
    - do-while
    - breack, continue // not show below
 */

public class Loop {
    public static void main(String[] args) {
        //-------   SWITCH ---------
        char c = 'b';
        switch(c){
            case 'a':
                System.out.println("this is a");
                break;
            case 'b':
                System.out.println("this is b");
                break;
            default:
                System.out.println("not found");
                break;
        }


        // --------- for loop --------
        for(int i=0; i<5; i++){
            System.out.print(i);  //01234
        }
        System.out.println();



        // --------- while loop --------
        int j = 0;
        while(j < 5){
            System.out.print(j++);  //01234
        }
        System.out.println();



        // --------- do while loop --------
        int k = 0;
        do{
            System.out.print(k++);  //01234
        }while(k<5);
        System.out.println();
    }
}
