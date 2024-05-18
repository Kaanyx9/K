package Proje01;

import java.util.Scanner;

public class IslemlerMenusu {
    public static void islemlerMenusu(Scanner tarayici) {
        while (true) {
            System.out.println("\nİŞLEMLER MENÜSÜ");
            System.out.println("1 - Vücut Kitle İndeksi Hesapla");
            System.out.println("2 - Haftalık Yemek Listenizi Hazırlayın");
            System.out.println("3 - Haftalık Spor Listenizi Hazırlayın");
            System.out.println("4 - Spor Hareketlerini Öğren");
            System.out.println("5 - Çıkış");
            System.out.print("Bir seçim yapın (1-5): ");

            int secim = tarayici.nextInt();
            tarayici.nextLine(); // Yeni satır karakterini temizlemek için

            switch (secim) {
                case 1:
                	VucutKitleIndeksi.hesaplaVKI(tarayici);
                    break;
                case 2:
                    YemekListesi.yemekListesiHazirla(tarayici);
                    break;
                case 3:
                    SporListesi.haftalikSporListesiHazirla(tarayici);
                    break;
                case 4:
                    SporHareketleri.sporHaraketleriniGoster(tarayici);
                    break;
                case 5:
                    System.out.println("Çıkış yapılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz seçim! Tekrar deneyin.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner tarayici = new Scanner(System.in);
        islemlerMenusu(tarayici);
    }
}