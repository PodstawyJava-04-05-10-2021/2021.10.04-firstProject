public class App7 {
    public static void main(String[] args) {
        int[] tab = {5,7,3,65,123,675,32};

        boolean founded = false;
        for(int element : tab) {
            if(element == 65) {
                System.out.println("Jest taki element");
                founded = true;
                break;
            }
        }

        if(!founded) {
            System.out.println("Nie znaleziono");
        }
    }
}
