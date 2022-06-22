public class g_compare {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";

        System.out.println(b.compareTo(a)); // 1    , b > a
        System.out.println(b.compareTo(b)); // 0    , b == b
        System.out.println(b.compareTo(c)); // -1   , b < c
    }
}
