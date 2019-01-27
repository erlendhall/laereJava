package kjoretoy;

public class Bil {

    private String kjennemerke;
    private int hestekrefter;
    private String farge;

    public Bil(String kjennemerke1,
               int hestekrefter1,
               String farge1) {
        kjennemerke = kjennemerke1;
        hestekrefter = hestekrefter1;
        farge = farge1;
    }

    public Bil() {

    }

    public void setKjennemerke(String kjennemerke) {
        this.kjennemerke = kjennemerke;
    }

    public String getKjennemerke() {
        return kjennemerke;
    }
}
