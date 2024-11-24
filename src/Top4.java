import java.util.Scanner;

public class Top4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a va b sonlarini kiriting:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int size = b - a + 1;
        int[] squares = new int[size];

        for (int i = 0; i < size; i++) {
            squares[i] = (a + i) * (a + i);
        }

        System.out.println("Kvadratlardan iborat massiv:");
        for (int square : squares) {
            System.out.print(square + " ");
        }
    }
}
