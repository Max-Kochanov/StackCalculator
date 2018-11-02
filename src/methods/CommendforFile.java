package methods;

import main.Main;

public class CommendforFile implements Command {
    @Override
    public void command(){
        String firstLetter = Main.scannerFile.next();
        String string = Main.scannerFile.nextLine();
        System.out.println(firstLetter + string);
    }

}
