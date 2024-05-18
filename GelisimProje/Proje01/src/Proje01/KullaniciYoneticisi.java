package Proje01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KullaniciYoneticisi {
    private Map<String, Kullanici> kullanicilar = new HashMap<>();

    public void kullaniciKayit(Scanner tarayici) {
        System.out.print("Kullanıcı Adı: ");
        String kullaniciAdi = tarayici.next();

        if (kullanicilar.containsKey(kullaniciAdi)) {
            System.out.println("Bu kullanıcı adı zaten alınmış.");
            return;
        }

        System.out.print("Parola: ");
        String parola = tarayici.next();

        Kullanici yeniKullanici = new Kullanici(kullaniciAdi, parola);
        kullanicilar.put(kullaniciAdi, yeniKullanici);
        System.out.println("\nKayıt başarıyla tamamlandı.");
    }

    public boolean kullaniciGiris(Scanner tarayici) {
        System.out.print("Kullanıcı Adı: ");
        String kullaniciAdi = tarayici.next();

        if (!kullanicilar.containsKey(kullaniciAdi)) {
            System.out.println("Bu kullanıcı adı kayıtlı değil.");
            return false;
        }

        System.out.print("Parola: ");
        String parola = tarayici.next();

        Kullanici kullanici = kullanicilar.get(kullaniciAdi);
        if (!kullanici.getParola().equals(parola)) {
            System.out.println("Hatalı kullanıcı adı veya parola.");
            return false;
        }

        System.out.println("Giriş başarıyla yapıldı!");
        return true;
    }
}