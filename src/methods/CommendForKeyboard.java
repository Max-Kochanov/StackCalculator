package methods;

import main.Main;

public class CommendForKeyboard implements Command {
    @Override
    public void command() {
        String string = Main.scannerKeyboard.next();
        System.out.println(string);
    }
}

