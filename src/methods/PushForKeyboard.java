package methods;

import main.Main;

import static main.MyStack.stack;

public class PushForKeyboard implements Command{
    String letterPush;
    @Override
    public void command(){
        letterPush = Main.scannerKeyboard.next();

        boolean checker = DefineForKeyboard.letter.equals(letterPush);

        if(checker){
            stack.push(DefineForKeyboard.digit);
        }
        else{
            System.out.println("Undefined letter");
        }
    }
}
