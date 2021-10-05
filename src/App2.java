public class App2 {
    public static void main(String[] args) {
        int a = 15;
        double b = 15;
        double wynik = a/b;
        System.out.println(wynik);

        String tekst1 = "Mateusz";
        String tekst2 = "Bereda";

        String tekstWynik = tekst1 + " " + tekst2;
        System.out.println(tekstWynik);

        boolean elementPierwszy = false;
        boolean elementDrugi = true;

        boolean wynikLogiczny = !elementPierwszy;

        System.out.println(wynikLogiczny);

        int i = 1;
        System.out.println(i++); // i = 2
        System.out.println(++i); // i = 3
        System.out.println(--i); // i = 2
        System.out.println(i--); // i = 1
        System.out.println(i);
    }
}
