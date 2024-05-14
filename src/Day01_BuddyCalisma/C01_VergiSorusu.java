package Day01_BuddyCalisma;

public class C01_VergiSorusu {

    public static void main(String[] args) {



        // Bir malın fiyatı 1500 TL dir.Bu mal,
        // %18 i kadar vergisi alınarak satılacaktır.
        // Bu malın vergisini ve satılacağı
        // fiyatı java programlama  dilinde hesaplayıp  ekrana yazdırınız.

        double fiyat = 1500.0;

        double vergi = 0.18;

        double vergiTutari = fiyat * vergi;

        double satisFiyati = fiyat + vergiTutari;

        System.out.println("Vergi tutari : " + vergiTutari
                           +"\nSatis Tutari : " + satisFiyati  );



    }
}
