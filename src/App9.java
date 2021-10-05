import java.util.Random;

public class App9 {
    public static void main(String[] args) {
        int[][] tab = new int[5][5];
        Random random = new Random();

        //wypełnianie losowymi liczbami
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                tab[i][j] = random.nextInt(101);
            }
        }

        //wypisywanie tablicy
        for(int[] row : tab) {
            for(int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        //wyliczanie średnich i zapamiętywanie największej, zapamiętywanie wiersza o największej średniej
        double maxAvr = 0.0;
        int maxIndex = 0;
        for(int j = 0; j < 5; j++) {
            int sum = 0;
            for(int i = 0; i < 5; i++) {
                sum = sum + tab[j][i];
            }
            double avr = sum/5.0;
            if(avr > maxAvr) {
                maxAvr = avr;
                maxIndex = j;
            }
            System.out.println(avr);
        }

        //wynik
        System.out.println("Największa średnia:");
        System.out.println(maxAvr);
        System.out.println("Wiersz z największa średnią:");
        System.out.println(maxIndex);
    }
}
