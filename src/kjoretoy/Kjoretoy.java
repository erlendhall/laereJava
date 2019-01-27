package kjoretoy;

public class Kjoretoy {
    private String farge;
    private String vekt;
    private String merke;

    public Kjoretoy(String farge, String vekt, String merke){
        this.farge = farge;
        this.vekt = vekt;
        this.merke = merke;
    }

    public Kjoretoy() {

    }

    public String getFarge() {
        return farge;
    }

    public void setFarge(String farge) {
        this.farge = farge;
    }

    public String getVekt() {
        return vekt;
    }

    public void setVekt(String vekt) {
        this.vekt = vekt;
    }

    public String getMerke() {
        return merke;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }
}


