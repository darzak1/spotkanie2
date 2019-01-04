import java.math.BigInteger;

public class Suma_Ziaren {
    public static void main(String[] args) {

        BigInteger suma = BigInteger.valueOf(1);
        BigInteger poprzednie_pole = BigInteger.valueOf(1);
        for (int i = 2; i < 65; ++i) {
            poprzednie_pole =  poprzednie_pole.multiply(BigInteger.valueOf(2));
            suma = suma.add(poprzednie_pole);
            System.out.println("pole = " + i + "; poprzednie_pole = " + poprzednie_pole + "; suma = " + suma);
        }
    }
}
