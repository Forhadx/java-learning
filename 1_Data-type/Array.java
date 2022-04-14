import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] arr1 = {1,2,3};
        System.out.println(arr1[1]); // 2

        
        int[] arr2 = new int[5];
        // arr2 = {1,2,3,4,5}; // not this way, use loop
        arr2[1] = 10;
        System.out.println(arr2[1]); // 2


        // int[] arr3;
        int[] arr3 = new int[5]; // must be initialize
        System.out.println("Enter 5 number:- ");
        for(int i=0; i<5; i++){
            arr3[i] = input.nextInt();
        }

        for(int i=0; i<5; i++){
            System.out.println(arr3[i]);
        }
    }   
}
