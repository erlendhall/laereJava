import kjoretoy.Bil;

public class Main {

    public static void main(String[] args) {
        Bil bil = new Bil("EL12345", 500, "blå", "2000", "Volvo");
        Bil bil2 = new Bil();

        bil.getVekt();

        System.out.print(bil.getKjennemerke() + ", ");
        System.out.println(bil.getKjennemerke());
        bil2.setFarge("rød");
        bil2.setHestekrefter(750);
        bil2.setKjennemerke("DL39230");
        System.out.println(bil2.getKjennemerke() + ", " + bil2.getFarge());
        System.out.println(bil2.toString());
    }
}
