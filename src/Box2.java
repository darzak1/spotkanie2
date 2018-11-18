import java.awt.*;

public class Box2 {

    int x1;
    int y1;
    int x2;
    int y2;

    Box2 (int x1, int y1, int x2, int y2) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        System.out.println("Konstruktor (int, int, int, int)");

        }

    Box2 (Point topLeft, Point bottomRight){

        this(topLeft.x, topLeft.y, bottomRight.x , bottomRight.y );
        System.out.println("Konstruktor (Point, Point)");



    }

    Box2 (Point topLeft, int w, int h){

        this(topLeft.x, topLeft.y, topLeft.x + w, topLeft.y +h);



    }

    void  printBox () {

        System.out.println("Box: <" + x1 + ", " + y1 + ", " + x2 + ", " + y2 + ">");

    }

    public static void main(String[] args) {

        Box2 rect;
        System.out.println("Wywołanie buildBox ze współrzędnymi (25,25) i (50,50) :");
        rect = new Box2(25,25, 50,50);
        rect.printBox();

        System.out.println("Wywołanie buildBox ze punktami (10,10) i (20,20) :");
        Point a = new Point(10,10);
        Point b = new Point(20,20);
        rect = new Box2(a,b);
        rect.printBox();

        System.out.println("Wywołanie buildBox z punktem (10,10) szerokością 50 i wysokością 50 :");
        rect = new Box2(a,50,50);
        rect.printBox();

    }
}
