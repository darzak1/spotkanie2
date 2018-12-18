import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TablicaN_Elementowa {

    public static void main(String[] args) {
        int[] tablica;
        Scanner odczyt = new Scanner(System.in);

        System.out.println();
        System.out.println("Podaj ilość elementów: ");
        int liczbaElementow = odczyt.nextInt();
        tablica = new int[liczbaElementow];

        for (int i = 0; i < tablica.length; i++)
            tablica[i] = i + 1;

        int licznik = 0;
        while (licznik < tablica.length) {
            System.out.print(tablica[licznik] + " ");
            licznik++;


        }

        System.out.println();
        System.out.println();
        System.out.println("Tablica wyświetlona w odwrotnej kolejności:");
        System.out.println();

        for (int i = tablica.length-1; i>=0; i--)
        {
            System.out.print(tablica[i] + " " );
        }
        System.out.println();


    }
}



