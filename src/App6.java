public class App6 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        for(int i = 0, b = 0; i < tab.length; i++, b = b + 2) {
            tab[i] = b;
        }

        for(int element : tab) {
            System.out.println(element);
        }
    }
}
