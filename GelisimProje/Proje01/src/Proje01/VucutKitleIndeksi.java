package Proje01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void hesaplaVKI(Scanner tarayici) {
        System.out.print("Lütfen boyunuzu (metre cinsinden ör: 1,78) girin: ");
        double boy = tarayici.nextDouble();

        System.out.print("Lütfen kilonuzu (kilogram cinsinden) girin: ");
        double kilo = tarayici.nextDouble();

        System.out.print("Lütfen yaşınızı girin: ");
        int yas = tarayici.nextInt();

        System.out.print("Lütfen cinsiyetinizi belirtin (E: Erkek, K: Kadın): ");
        String cinsiyet = tarayici.next();

        // Vücut kitle indeksi (BMI) hesaplama
        double vki = kilo / (boy * boy);

        // Vücut yağ oranı hesaplama
        double vucutYagOrani = 0;
        if (cinsiyet.equalsIgnoreCase("E")) { // Erkek için
            vucutYagOrani = (1.20 * vki) + (0.23 * yas) - 16.2;
        } else if (cinsiyet.equalsIgnoreCase("K")) { // Kadın için
            vucutYagOrani = (1.20 * vki) + (0.23 * yas) - 5.4;
        } else {
            System.out.println("Geçersiz cinsiyet girişi!");
            return;
        }

        System.out.println("Vücut Kitle İndeksi (VKI): " + vki);
        System.out.println("Vücut Yağ Oranı: " + new DecimalFormat("##.##").format(vucutYagOrani) + "%");

        // Sağlıklı kilo aralığını hesapla ve yazdır
        double idealKiloAltSinir = 18.5 * (boy * boy);
        double idealKiloUstSinir = 24.9 * (boy * boy);
        System.out.println("Sağlıklı Kilo Aralığı: " + idealKiloAltSinir + " - " + idealKiloUstSinir);

        // Kullanıcının kilosunu değerlendir ve durumunu yazdır
        if (kilo < idealKiloAltSinir) {
            System.out.println("Kilonuz sağlıklı kilo aralığının altında.");
        } else if (kilo > idealKiloUstSinir) {
            System.out.println("Kilonuz sağlıklı kilo aralığının üstünde.");
        } else {
            System.out.println("Kilonuz sağlıklı kilo aralığında.");
        }
    }
}
