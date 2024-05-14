package Day02_JavaPractice;

public class Day02_Operatorspractice {

    public static void main(String[] args) {

       /*
       Operatorler:

       += : sayi+=n bu islemde sayiya n ekler ve yeni deger olarak sayiya atar
       -= : sayi-=n bu islemde sayidan n cikarir
       *= : sayi*=n bu islemde sayiyi n ile carpar
       /= : sayi/=n bu islemde sayiyi n e boler
       %  : sayi%n  bu islemde sayinin n ile kalanini verir.
       */

        int a=100;
        System.out.println(a+=100); // sayiya 100 ekler ve degeri atar
        System.out.println("a=" + a);

        int b=10;
        System.out.println(b+10);// sayiya 10 ekler ama atama yapmaz
        System.out.println("b=" + b);

        int c= 50;
        System.out.println(c*=10);
        System.out.println("c=" + c);

        int d=300;
        System.out.println(d/=10);
        System.out.println("d =" + d);

        int e =235;
        System.out.println(e%2);
        System.out.println("e= " + e);

        int f= 45;
        System.out.println(f-=5);
        System.out.println("f = " +f);

        int g = 233;
        System.out.println(g%=2);
        System.out.println("g : " + g);







    }
}
