package main;
import methods.*;

import static main.Main.checkerFileOrKeyboard;

public class FactoryMethod{

    public static Command getCommandByName(String string){
        switch(string){
            case "Sqrt" : return new Sqrt();
            case "Sum" : return new Sum();
            case "Difference" : return new Difference();
            case "Division" : return new Division();
            case "Product" : return new Product();
            case "Print" : return new Print();
            case "Push" : {
                if(checkerFileOrKeyboard == true) return new PushForFile();
                else return new PushForKeyboard();
            }
            case "Pop" : return new Pop();
            case "Define" : {
                if(checkerFileOrKeyboard == true) return new DefineForFile();
                else return new DefineForKeyboard();
            }
            case "#" : {
                if(checkerFileOrKeyboard == true) return new CommendforFile();
                else return new CommendForKeyboard();
            }
            default: {
                System.out.println("Unknown command");
                return null;
            }
        }
    }
}