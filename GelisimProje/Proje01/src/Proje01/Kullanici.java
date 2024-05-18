package Proje01;

class Kullanici {
	private String kullaniciAdi;
    private String parola;

    public Kullanici(String kullaniciAdi, String parola) {
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
}


