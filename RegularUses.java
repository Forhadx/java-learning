import java.util.Arrays;

public class RegularUses {
    public static void main(String[] args) {
        int[] arr = {23, 2, 4, 6, 1};

        // MAX
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max); // 23
    
    
        // sort
        Arrays.sort(arr);
        System.out.println("Sort");
        for(int n: arr){
            System.out.print(n);
        }
        System.out.println();


        // abs
        System.out.println(Math.abs(-10));

        //xor
        System.out.println(15 ^ 27);
    }
}
