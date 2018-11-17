public class Blocs {

    public static void main(String[] args) {

        int x =5;

        {// początek bloku
            int y = 10;
            y= y + x;

            System.out.println("y = " + y);
        }// koniec bloku

        System.out.println();

    }
}
