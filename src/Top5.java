import java.util.Scanner;

public class Top5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N va M qiymatlarini kiriting:");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];

        System.out.println("Massiv elementlarini kiriting:");
        int positiveCount = 0, negativeCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
                if (array[i][j] > 0) {
                    positiveCount++;
                } else if (array[i][j] < 0) {
                    negativeCount++;
                }
            }
        }

        System.out.println("Musbat sonlar soni: " + positiveCount);
        System.out.println("Manfiy sonlar soni: " + negativeCount);
    }
}
