package Day02_JavaPractice;

import java.util.Scanner;

public class C05_Casting {

    public static void main(String[] args) {


        Scanner selcuk= new Scanner(System.in);
        System.out.println("Lutfen ondalıklı bir sayi giriniz");

        double a = selcuk.nextDouble();
        System.out.println("Lutfen ondalıklı bir sayi daha giriniz");
        double b= selcuk.nextDouble();

        int c = (int)(a/b);
        System.out.println(c);

    }
}
