import java.awt.*;

public class Lab4_2 extends Point {
    int z;
    int w;

    public Lab4_2(int x, int y, int z, int w) {
        super(x, y);
        this.z = z;
        this.w = w;
    }

    public static void main(String[] args) {
        Lab4_2 lab4_2 = new Lab4_2(5, 5, 8, 10);
        System.out.println("x wynosi: " + lab4_2.x);
        System.out.println("y wynosi: " + lab4_2.y);
        System.out.println("z wynosi: " + lab4_2.z);
        System.out.println("w wynosi: " + lab4_2.w);


    }
}