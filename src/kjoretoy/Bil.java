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

    public void setHestekrefter(int hestekrefter) {
        this.hestekrefter = hestekrefter;
    }

    public void setFarge(String farge) {
        String tall= "2";
        int tall2 = 1;

        this.farge = farge;
    }

    public String getFarge() {
        return farge;
    }

    public int getHestekrefter() {
        return hestekrefter;
    }
    public String toString() {
        return "Kjennemerke: " + getKjennemerke() + "\n" + "Farge: " + getFarge() + "\n" + getHestekrefter();
    }
}
