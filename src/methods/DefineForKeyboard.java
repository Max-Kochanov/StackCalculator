package methods;

import main.Main;

public class DefineForKeyboard implements Command {
    public static String letter;
    public static double digit;

    @Override
    public void command() {
        letter = Main.scannerKeyboard.next();
        digit = Double.parseDouble(Main.scannerKeyboard.next());
    }
}
