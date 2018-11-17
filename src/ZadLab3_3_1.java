public class ZadLab3_3_1 {

    public static void main(String[] args) {
       int yearIn =2000;

        for (int miesiac = 1; miesiac <= 12; miesiac++) {
            for (int dzien = 1; dzien <=  DayCounter.countDays(miesiac, yearIn); dzien++) {
                System.out.println(dzien + "/" + miesiac + "/" + yearIn);
            }
        }


        DayCounter.countDays(1,1);





    }
}


