package Day02_JavaPractice;

import java.util.Scanner;

public class Day02_JAvaPractice {

    public static void main(String[] args) {

        /*
Öğrenciden Vize ve Final Notlarını 1.Vize Notu, 2. Vize Notu ve Final Notu olarak alan
Yıl sonu Başarı puanını vize ortalamasının %40, Final Notunun %60 etkisi olacak şekilde hesaplayıp
Tüm Notlarını ve Yıl Sonu Başarı Notunu yyazdıran bir kod yazınız
 */


        Scanner scan =new Scanner(System.in);

        System.out.print("1. Vize Notu: ");
        double vize1 = scan.nextDouble();
        System.out.print("2. Vize Notu:  ");
        double vize2= scan.nextDouble();
        System.out.print("Final Notu: ");
        double finalNotu= scan.nextDouble();


        System.out.println("-------------------Yil Sonu Basari Notu Tablosu----------");
        System.out.println(" ");
        System.out.println("\t1. Vize Notu:  " + vize1+"\n\t2. Vize Notu:" +vize2+"\n\tFinal Notu: " +finalNotu);

        System.out.println("Yil sonu basari Notu : "+(((vize1+vize2)/2)*0.4+finalNotu*0.6));












    }
}
