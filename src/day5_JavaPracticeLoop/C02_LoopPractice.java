package day5_JavaPracticeLoop;

public class C02_LoopPractice {

    public static void main(String[] args) {


//Girilen bir stringdeki a harfi sayısını bulunuz.
//ama  c harfine  gelirse döngüden çıkılsın.

        String text = "Java Candir.Gerisi Heyecandir.";

        int aSayisi = 0;

        for (int i =0 ; i <text.length() ; i++) {
            if (text.toLowerCase().charAt(i)=='a'){
                aSayisi++;
            } else if (text.toLowerCase().charAt(i)=='c'){
                break;
            }

        }
        System.out.println("Cümledeki a harfi sayisi : " + aSayisi);






    }
}
