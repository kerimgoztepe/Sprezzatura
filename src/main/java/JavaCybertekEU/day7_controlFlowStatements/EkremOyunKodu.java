package JavaCybertekEU.day7_controlFlowStatements;

import java.util.*;

public class EkremOyunKodu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz =");
        double sayi = sc.nextDouble();

        if (sayi>0 && sayi<20) {
            System.out.println("BRAVOOOO=====dogru sayi girdiniz");
        }else {
            System.out.println("YANLISSSSS----lutfen yeni bir sayi deneyiniz");
        }
    }



}
