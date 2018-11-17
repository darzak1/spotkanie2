public class HalfDolllarsLoops {

    public static void main(String[] args) {

        int[] denver = {1_700_000, 4_600_000, 2_100_000,};
        int[] phili = {1_800_000, 5_000_000, 2_500_000};
        int[] total = new int[denver.length];
        int average;
        int sum = 0;

        for (int i = 0; i < denver.length; i++) {
            total[i] = denver[i] + phili[i];
            System.out.println("produkcja w " + (2012 + i) + ": ");
            System.out.printf("%,d%n", total[i]);
            sum += total[i];
        }

        average = sum / denver.length;
        System.out.println("Srednia produkcja: ");
        System.out.printf("%,d%n", average);
    }
}



//        phili[0] = 1_800_000;
//        phili[1] = 5_000_000;
//        phili[2] = 2_500_000;
//
////        total [0] = denver [0] + phili[0];
////        total [1] = denver [1] + phili[1];
////        total [2] = denver [2] + phili[2];
//
//
//        average = (total[0] + total[1] + total[2]) / denver.length ;
//        System.out.println("Produkcja w 2012: ");
//        System.out.format("%,d%n", total[0]);
//        System.out.println("Produkcja w 2013: ");
//        System.out.format("%,d%n", total[1]);
//        System.out.println("Produkcja w 2014: ");
//        System.out.format("%,d%n", total[2]);
//
//        System.out.println("Srednia produkcja w latach 2012-2014: ");
//        System.out.format("%,d%n", average);
//
//



