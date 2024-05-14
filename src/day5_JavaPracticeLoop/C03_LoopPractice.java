package day5_JavaPracticeLoop;

import java.util.Scanner;

public class C03_LoopPractice {

    public static void main(String[] args) {


        // Kullanıcıdan 10 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç,
        // diğerlerinin toplamını bulunuz.

        Scanner scanner = new Scanner(System.in);

        int toplam = 0;

            for (int i = 1; i <=10 ; i++) {
            System.out.print("Lutfen " + i + ". sayiyi giriniz: ");
            int sayi = scanner.nextInt();
            if (sayi>5 && sayi <10){
                continue;
            }
            toplam+=sayi;
        }
        System.out.println(toplam);





    }
}
