public class Loops {
    public static void main(String[] args) {

        for (int i = 1; i <= 12; i++) {
            System.out.println("i= " + i);
        }

        int j = 0;

        while (j < 100) {
            System.out.println("j=" + j);
            j++;

        }

        int k = 0;

        do {
            System.out.println("k=" + k);
            k++;
        } while (false);


        final String FORBIDEN = "pięć";
        String[] strings = {"raz", "dwa", "trzy", "cztery", "pięć", "dwa", "trzy"};
        int l = 0;

        System.out.println("----------------------------------- START");

        while (l < strings.length) {
            if (strings[l].equals(FORBIDEN)) {
                break;
            }
            System.out.println(strings[l]);
            l++;

        }

        System.out.println("----------------------------------- KONIEC");


//        out: for (int m=0; m<10; m++);{
//            for (int o=0, o<10; o++) {
//                System.out.println("m=" + m + " o=" + o);
//                if (m==5 && o==5) {
//                    break out;
//                }
//
//    }
//
//}

    }
}