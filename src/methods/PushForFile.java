package methods;

import main.Main;

import static main.MyStack.stack;

public class PushForFile implements Command {
    String letterPush;

    @Override
    public void command() {
        letterPush = Main.scannerFile.next();

        boolean checker = DefineForFile.letter.equals(letterPush);

        if (checker) {
            stack.push(DefineForFile.digit);
        } else {
            System.out.println("Undefined letter");
        }
    }
}
