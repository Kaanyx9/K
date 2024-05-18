package Proje01;

import java.util.Scanner;

public class Proje01 {
    private static KullaniciYoneticisi kullaniciYoneticisi = new KullaniciYoneticisi();
    private static boolean oturumAcik = false;

    public static void main(String[] args) {
        Scanner tarayici = new Scanner(System.in);
        System.out.println("SAKA SPOR PROGRAMINA HOŞGELDİNİZ....");
        while (true) {
            if (!oturumAcik) {
                System.out.println("\n1 - Kayıt Ol");
                System.out.println("2 - Giriş Yap");
                System.out.println("3 - Çıkış");
                System.out.print("\nSeçiminizi yapın: ");
                int secim = tarayici.nextInt();

                switch (secim) {
                    case 1:
                        kullaniciYoneticisi.kullaniciKayit(tarayici);
                        break;
                    case 2:
                        oturumAcik = kullaniciYoneticisi.kullaniciGiris(tarayici);
                        break;
                    case 3:
                        System.out.println("Programdan çıkılıyor...");
                        return;
                    default:
                        System.out.println("Geçersiz seçim!");
                        break;
                }
            } else {
                IslemlerMenusu.islemlerMenusu(tarayici);
            }
        }
    }
}