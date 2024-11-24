public class Top2 {
    public static void main(String[] args) {
        System.out.println("Toq sonlar:");
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nJuft sonlar:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }
}
