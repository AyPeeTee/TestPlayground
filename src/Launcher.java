import java.util.Scanner;

public class Launcher {

    public void run() throws InterruptedException {
        while (true) {
            System.out.println(LanguageManager.INSTANCE.getLanguage());
            
            System.out.println("zmenit jazyk?");
            LanguageManager.languageChanger();
        }
    }
}
