package Hospitals;

public class Building {

    private int kolicEtag;
    private int plosad;
    private String adres;

    public Building() {
    }

    public Building(int kolicEtag, int plosad, String adres) {
        this.kolicEtag = kolicEtag;
        this.plosad = plosad;
        this.adres = adres;
    }

    public int getKolicEtag() {
        return kolicEtag;
    }

    public void setKolicEtag(int kolicEtag) {
        this.kolicEtag = kolicEtag;
    }

    public int getPlosad() {
        return plosad;
    }

    public void setPlosad(int plosad) {
        this.plosad = plosad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Building{" +
                "kolicEtag=" + kolicEtag +
                ", plosad=" + plosad +
                ", adres='" + adres + '\'' +
                '}';
    }
}
