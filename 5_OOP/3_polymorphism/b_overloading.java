
class Shape{
    public int len;
    public int wid;

    public void area(int len){
        System.out.println("lenth: "+len);
    }

    public void area(int len, int wid){
        System.out.println("box: "+(len*wid));
    }
}

public class b_overloading {
    public static void main(String[] args) {
        Shape obj = new Shape();

        obj.area(2); // lenth: 2
        obj.area(2, 3); // box: 6
    }
}
