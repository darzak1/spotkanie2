public class ShowArray {

    public static void main(String[] args) {

        // zadanie wyświetl wszyskie elementy tablicy

        int[][][] array = {{{1, 2, 3}, {1, 2}}};


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print("array");
                    System.out.print("[" + i + "]");
                    System.out.print("[" + j + "]");
                    System.out.print("[" + k + "]");
                    System.out.print(array[i][j][k]);
                    System.out.println();
                }
            }
        }


    }
}


//     2   for (int i = 0; i < array[i].length; i++)
//            for (int j = 0; j < array[j].length; j++)
//                for (int k = 0; k < array[k].length; k++) {
//                    array[i][j][k] = 0;
//                    System.out.println();
//                    System.out.print(array[i][j][k]);
//                    System.out.println();
//                }


//    1    for (int i = 0; i < array.length; i++)
//            for (int j = 0; j < array.length; j++) {
//                System.out.print(array[i] + " ");
//                System.out.print(array[j] + " ");
//            }