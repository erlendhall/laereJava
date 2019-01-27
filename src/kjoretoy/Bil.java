package kjoretoy;

public class Bil extends Kjoretoy{

    private String kjennemerke;
    private int hestekrefter;

    public Bil(String kjennemerke,
               int hestekrefter,
               String farge,
               String vekt,
               String merke) {
        super(farge, vekt, merke);
        this.kjennemerke = kjennemerke;
        this.hestekrefter = hestekrefter;
    }

    public Bil() {

    }

    public void setKjennemerke(String kjennemerke) {
        this.kjennemerke = kjennemerke;
    }

    public String getKjennemerke() {
        return kjennemerke;
    }

    public void setHestekrefter(int hestekrefter) {
        this.hestekrefter = hestekrefter;
    }

    public int getHestekrefter() {
        return hestekrefter;
    }
    public String toString() {
        return "Kjennemerke: " + getKjennemerke() + "\n" + "Farge: " + getFarge() + "\n" + getHestekrefter();
    }
}
