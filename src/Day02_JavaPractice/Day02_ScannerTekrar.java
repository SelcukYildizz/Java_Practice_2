package Day02_JavaPractice;

import java.util.Scanner;

public class Day02_ScannerTekrar {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        // System.out.println("Lutfen adinizi giriniz.");

       // String name = scan.nextLine(); // next () dersek ilk kelimeyi, next line dersek komple cümleyi alır.


        //System.out.println(name);

        /*
Kullanıcıdan adını soyadı ve şifresini alıp sisteme kaydedip
 aşağıdaki gibi bir çıktı veren kodu yazınız
------ Sistem Kaydı Tamamlandı ------
Bilgileriniz sistemlerimize;
    Adı: Murat
    Soyadı: Yiğit
    Şifre: 123698
Olarak kaydedilmiştir
 */

        System.out.println("Adiniz");
        String name = scan.nextLine();
        System.out.println("Soyadiniz");
        String surname= scan.nextLine();
        System.out.println("Sifreniz");
        int pass= scan.nextInt();
        System.out.println("----------Sistem kaydi tamamlandi---------");
        System.out.println("Bilgileriniz sisteme;");
        System.out.println("Adi : " + name);






    }}
