package Day02_JavaPractice;

import java.util.Scanner;

public class C04_MatematikIslemleri {

    public static void main(String[] args) {

/*
soru:
Kullanıcıdan decimal bir sayı alıp bu sayının binary karşılığını yazdırın.
Decimal : 10'luk taban (Günlük hayat 0,1,2,3,4,5,6,7,8,9)
Binary  : 2'lik tabandaki karşılığıdır. (0,1)
 */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Binary karsiligini gormek istediginiz bir tam sayi giriniz");

        int sayi = scanner.nextInt();

        // int kalan1= sayi%2;
        // sayi/=2;

        // int kalan2= sayi%2;
        // sayi/=2;
        // int kalan3= sayi%2;
        // sayi/=2;
        // int kalan4=sayi%2;
        // sayi/=2;

      // System.out.println("Girdiginiz sayinin binary karsiligi : " + sayi+kalan4+kalan3+kalan2+kalan1);


      String binaryDeeger = Integer.toBinaryString(sayi);

        System.out.println("Binary deger + " +binaryDeeger);








    }
}
