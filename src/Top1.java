import java.util.Scanner;

public class Top1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Stringni kiriting:");
        String s = scanner.nextLine();

        int sum = 0;
        boolean hasDigits = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                sum += c - '0';
                hasDigits = true;
            }
        }

        if (hasDigits) {
            System.out.println("Raqamlar yig'indisi: " + sum);
        } else {
            System.out.println("-1");
        }
    }
}
