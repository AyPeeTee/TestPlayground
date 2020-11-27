import java.util.Scanner;

public class InputManager {
    static Scanner sc;
    static String input;

    public static void newInput() {
        sc = new Scanner(System.in);
        input = sc.nextLine();
    }
}
