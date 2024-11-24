import java.util.Scanner;

public class Top6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N sonini kiriting:");
        int n = scanner.nextInt();

        boolean isPowerOfTwo = (n > 0) && ((n & (n - 1)) == 0);
        System.out.println(isPowerOfTwo);
    }
}
