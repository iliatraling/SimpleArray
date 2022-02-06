package Exersise5;

public class RaggedArray {
    public static void main(String[] args) {
        int[][] trips = new int[7][];
        trips[0] = new int[10];
        trips[1] = new int[10];
        trips[2] = new int[10];
        trips[3] = new int[10];
        trips[4] = new int[10];
        trips[5] = new int[2];
        trips[6] = new int[2];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                trips[i][j] = i + j + 10;
            }
        }
        for (int i = 5; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                trips[i][j] = i + j + 10;
            }
        }
        System.out.println("Количество пассажиров, перевезенных каждым рейсом в будние дни:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(trips[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Количество пассажиров, перевезенных каждым рейсом в выходные дни:");
        for (int i = 5; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(trips[i][j] + " ");
            }
            System.out.println();
        }
    }
}
