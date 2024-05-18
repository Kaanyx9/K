package Proje01;

import java.util.Scanner;

public class YemekListesi {
    public static void yemekListesiHazirla(Scanner tarayici) {
        System.out.print("Vücut Kitle İndeksi (VKI) girin: ");
        double vki = tarayici.nextDouble();

        if (vki < 18.5) {
            System.out.println("Yemek Listeniz Hazırlanıyor...");
            System.out.println("Haftalık Yemek Listesi (Sağlıklı Kilo Aralığının Altında)");
            System.out.println("1. Gün: Meyve salatası, ton balıklı sandviç, yoğurt");
            System.out.println("2. Gün: Yoğurtlu yulaf ezmesi, tavuklu sebzeli salata, meyve");
            System.out.println("3. Gün: Ton balıklı sandviç, yoğurt, meyve");
            System.out.println("4. Gün: Izgara tavuk, kinoa salatası, meyve");
            System.out.println("5. Gün: Sebzeli mercimek çorbası, ızgara sebzeler, meyve");
            System.out.println("6. Gün: Yoğurtlu meyve salatası, somon füme, meyve");
            System.out.println("7. Gün: İzmirli böreği, tavuk baget, meyve");
        } else if (vki >= 18.5 && vki <= 24.9) {
            System.out.println("Yemek Listeniz Hazırlanıyor...");
            System.out.println("Haftalık Yemek Listesi (Sağlıklı Kilo Aralığı)");
            System.out.println("1. Gün: Meyveli yoğurt, kızarmış balık, sebzeli pilav");
            System.out.println("2. Gün: Ispanak çorbası, tavuk salata, meyve");
            System.out.println("3. Gün: Kabak köftesi, yoğurt, meyve");
            System.out.println("4. Gün: Mercimek yemeği, yoğurtlu sebzeli bulgur pilavı, meyve");
            System.out.println("5. Gün: Izgara tavuk, sebzeli makarna, meyve");
            System.out.println("6. Gün: Somon füme, salata, meyve");
            System.out.println("7. Gün: Sebzeli omlet, ton balıklı sandviç, meyve");
        } else {
            System.out.println("Yemek Listeniz Hazırlanıyor...");
            System.out.println("Haftalık Yemek Listesi (Sağlıklı Kilo Aralığının Üstünde)");
            System.out.println("1. Gün: Yulaf lapası, meyve, ceviz");
            System.out.println("2. Gün: Tavuklu noodle çorbası, meyve, yoğurt");
            System.out.println("3. Gün: Sebzeli kinoa salatası, ton balıklı sandviç, meyve");
            System.out.println("4. Gün: Ispanaklı omlet, yoğurt, meyve");
            System.out.println("5. Gün: Izgara tavuk, kinoa pilavı, meyve");
            System.out.println("6. Gün: Cevizli yoğurt, somon füme, meyve");
            System.out.println("7. Gün: Sebzeli mercimek çorbası, ton balıklı salata, meyve");
        }
    }
}