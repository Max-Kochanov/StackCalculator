package main;
import methods.*;
import static main.Main.checkerFileOrKeyboard;

public class FactoryMethod{

    public static Command getCommandByName(String string){
        switch(string){
            case "sqrt" : return new Sqrt();
            case "sum" : return new Sum();
            case "diff" : return new Difference();
            case "divide" : return new Division();
            case "product" : return new Product();
            case "print" : return new Print();
            case "push" : {
                if(checkerFileOrKeyboard == true) return new PushForFile();
                else return new PushForKeyboard();
            }
            case "pop" : return new Pop();
            case "define" : {
                if(checkerFileOrKeyboard == true) return new DefineForFile();
                else return new DefineForKeyboard();
            }
            case "#" : {
                if(checkerFileOrKeyboard == true) return new CommendforFile();
                else return new CommendForKeyboard();
            }
            case "break" : return null;
            default: {
                System.out.println("Unknown command");
                return null;
            }
        }
    }
}