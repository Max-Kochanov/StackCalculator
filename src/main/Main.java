package main;
import exceptions.StackException;
import methods.Command;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static main.FactoryMethod.getCommandByName;

public class Main {
    public static Scanner scannerFile;
    public static Scanner scannerKeyboard;
    public static boolean checkerFileOrKeyboard;

    public static void fileInput() throws FileNotFoundException {
           scannerFile = new Scanner(new File("E:\\Java_projects\\StackCalculator 2.0\\src\\input\\Input"));
           checkerFileOrKeyboard = true;
    }

    public static void main(String[] args) {
        try {
            fileInput();
        }
        catch(Exception ex){
            scannerKeyboard = new Scanner(System.in);
            checkerFileOrKeyboard = false;
        }

        String string;

        if(checkerFileOrKeyboard == true) {
            while (scannerFile.hasNext()) {
                string = scannerFile.next();
                Command CurrentClass = getCommandByName(string);
                try {
                    CurrentClass.command();
                }
                catch(StackException ex){
                    System.out.println(ex);
                    return;
                }
            }
        }
        else{
            string = scannerKeyboard.next();

            while(true) {
                Command CurrentClass = getCommandByName(string);
                try {
                    CurrentClass.command();
                }
                catch(StackException ex){
                    System.out.println(ex);
                    return;
                }
                string = scannerKeyboard.next();
            }
        }

    }

}
