public class Suma_Ziaren {
    public static void main(String[] args) {


        int c = 2;
        int[] pola = new int[65];
        for (int i=1; i<65; i++){
            pola[i]=i;
        int liczbaZiaren = ((pola[i] + (i-1))*2)-1;
        System.out.print(liczbaZiaren + " ");
        System.out.println(pola[i] + " ");
        }




    }
}
