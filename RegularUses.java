import java.util.Arrays;

public class RegularUses {
    public static void main(String[] args) {
        int[] arr = {23, 2, 4, 6, 1};

        // MAX
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max); // 23
    }
}
