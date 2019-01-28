import kjoretoy.Bil;

public class Main {

    public static void main(String[] args) {
        Bil bil = new Bil("EL12345", 500, "blå", "2000", "Volvo");
        Bil bil2 = new Bil();
        Bil bil3 = Bil.builder()
                .kjennemerke("EL54321")
                .hestekrefter(500)
                .farge("rød")
                .vekt("1500")
                .merke("Ford")
                .build();

        System.out.println(bil.toString() + "\n");
        System.out.println(bil2.toString() + "\n");
        System.out.println(bil3.toString());
    }
}
