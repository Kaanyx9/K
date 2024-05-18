package Proje01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Hesaplayici {
    private double boy;
    private double kilo;
    private int yas;
    private String cinsiyet;

    // Getter ve Setter metodları
    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public void vucutYagOraniHesapla(Scanner tarayici) {
        System.out.print("Lütfen boyunuzu (metre cinsinden ör:1,78) girin: ");
        setBoy(tarayici.nextDouble());

        System.out.print("Lütfen kilonuzu (kilogram cinsinden) girin: ");
        setKilo(tarayici.nextDouble());

        System.out.print("Lütfen yaşınızı girin: ");
        setYas(tarayici.nextInt());

        System.out.print("Lütfen cinsiyetinizi belirtin (E: Erkek, K: Kadın): ");
        setCinsiyet(tarayici.next());

        double vki = getKilo() / (getBoy() * getBoy());

        double vucutYagOrani = 0;
        if (getCinsiyet().equalsIgnoreCase("E")) {
            vucutYagOrani = (1.20 * vki) + (0.23 * getYas()) - 16.2;
        } else if (getCinsiyet().equalsIgnoreCase("K")) {
            vucutYagOrani = (1.20 * vki) + (0.23 * getYas()) - 5.4;
        } else {
            System.out.println("Geçersiz cinsiyet girişi!");
            return;
        }

        System.out.println("Vücut Kitle İndeksi (VKI): " + vki);
        System.out.println("Vücut Yağ Oranı: " + new DecimalFormat("##.##").format(vucutYagOrani) + "%");

        double idealKiloAltSinir = 18.5 * (getBoy() * getBoy());
        double idealKiloUstSinir = 24.9 * (getBoy() * getBoy());
        System.out.println("Sağlıklı Kilo Aralığı: " + idealKiloAltSinir + " - " + idealKiloUstSinir);

        if (getKilo() < idealKiloAltSinir) {
            System.out.println("Kilonuz sağlıklı kilo aralığının altında.");
        } else if (getKilo() > idealKiloUstSinir) {
            System.out.println("Kilonuz sağlıklı kilo aralığının üstünde.");
        } else {
            System.out.println("Kilonuz sağlıklı kilo aralığında.");
        }
    }
}