public class HW2 {

    /*
Create 2D array of cars : american, german, korean, italian.
Then retrieve all values from that array using 2 different loops
*/
    public static void main(String[] args) {
        String[][] cars = {
                {"american", "german",},
                {"korean", "italian",}
        };
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (String[] cars1:cars) {
            for (String cars2 : cars1) {
                System.out.print(cars2 + " ");
            }
            System.out.println();
        }
    }

}







