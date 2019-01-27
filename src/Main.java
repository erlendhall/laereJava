import kjoretoy.Bil;

public class Main {

    public static void main(String[] args) {
        Bil bil = new Bil("EL12345", 500, "blå");
        Bil bil2 = new Bil();

        System.out.print(bil.getKjennemerke() + ", ");
        System.out.println(bil.kjennemerke);
    }
}
