package Proje01;

import java.util.Scanner;

public class SporListesi {
    public static void haftalikSporListesiHazirla(Scanner tarayici) {
        System.out.print("Vücut Kitle İndeksi (VKI) girin: ");
        double vki = tarayici.nextDouble();

        if (vki < 18.5) { 
            System.out.println("\nDüşük VKI İçin Haftalık Spor Listesi:");
            System.out.println("Pazartesi: Kardiyo (koşu veya yürüyüş)");
            System.out.println("Salı: Koşu bandı ve ağırlık antrenmanı");
            System.out.println("Çarşamba: Yüzme ve pilates");
            System.out.println("Perşembe: Kardiyo (bisiklet veya merdiven çıkma) ve yoga");
            System.out.println("Cuma: Vücut ağırlığı egzersizleri (push-up, squat, plank)");
            System.out.println("Cumartesi: Dinlenme veya hafif yürüyüş");
            System.out.println("Pazar: Dinlenme");
        } else if (vki >= 18.5 && vki < 25) { 
            System.out.println("\nNormal VKI İçin Haftalık Spor Listesi:");
            System.out.println("Pazartesi: Yürüyüş ve hafif kardiyo");
            System.out.println("Salı: Yüzme ve vücut ağırlığı egzersizleri");
            System.out.println("Çarşamba: Koşu ve yoga");
            System.out.println("Perşembe: Ağırlık antrenmanı ve pilates");
            System.out.println("Cuma: Esneklik ve denge egzersizleri");
            System.out.println("Cumartesi: Dinlenme veya hafif egzersiz");
            System.out.println("Pazar: Dinlenme");
        } else { 
            System.out.println("\nYüksek VKI İçin Haftalık Spor Listesi:");
            System.out.println("Pazartesi: Yoğun kardiyo antrenmanı");
            System.out.println("Salı: Ağırlık antrenmanı ve yürüyüş");
            System.out.println("Çarşamba: Aerobik ve esneme egzersizleri");
            System.out.println("Perşembe: Yüzme ve pilates");
            System.out.println("Cuma: Koşu ve kardiyo");
            System.out.println("Cumartesi: Dinlenme");
            System.out.println("Pazar: Dinlenme");
        }
    }
}