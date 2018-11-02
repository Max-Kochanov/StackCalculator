package methods;

import main.Main;

public class CommendForKeyboard implements Command {
    @Override
    public void command() {
        String firstLetter = Main.scannerKeyboard.next();
        String string = Main.scannerKeyboard.nextLine();
        System.out.println(firstLetter + string);
        }
    }


