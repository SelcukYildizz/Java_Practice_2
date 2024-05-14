package day5_JavaPracticeLoop;

public class C01_LoopPractice {

    public static void main(String[] args) {

        /*
        for loop : Bir döngü işlemi olup,
        döngünün ilerleme aralığı sabit ise kullanılır.

        while : Bir de döngü işlemi olup,
        döngünün ilerleme aralığı sabit olma zorunluluğu yok ise kullanılır.

        for each loop : Bu ise liste ile işlem yapışır.

         */

        // Soru : TASK :
        // 100'den 0'a kadar 13'e tam bölünebilen sayıları ve
        // toplamlarını ekrana yazdırınız (büyükten küçüğe).

        int toplam = 0;

        for (int i = 100; i >0 ; i--) {

            if (i % 13 == 0){
                System.out.print(i + " "); // 91 78 65 52 39 26 13
                toplam+=i;
            }

        }
        System.out.println("");
        System.out.print("İstenen sayilarin toplami : " + toplam);




    }
}
