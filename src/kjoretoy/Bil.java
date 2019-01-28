package kjoretoy;

public class Bil extends Kjoretoy {

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

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String farge;
        private String vekt;
        private String merke;
        private String kjennemerke;
        private int hestekrefter;

        public Builder farge(String farge) {
            this.farge = farge;
            return this;
        }

        public Builder vekt(String vekt) {
            this.vekt = vekt;
            return this;
        }

        public Builder merke(String merke) {
            this.merke = merke;
            return this;
        }

        public Builder kjennemerke(String kjennemerke) {
            this.kjennemerke = kjennemerke;
            return this;
        }

        public Builder hestekrefter(int hestekrefter) {
            this.hestekrefter = hestekrefter;
            return this;
        }

        public Bil build() {
            return new Bil(
                    kjennemerke,
                    hestekrefter,
                    farge,
                    vekt,
                    merke
            );
        }
     }
}
