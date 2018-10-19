package main;

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
           scannerFile = new Scanner(new File("E:\\Java_projects\\StackCalculator 2.0\\src\\input\\Inpu"));
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
                CurrentClass.command();
            }
        }
        else{
            string = scannerKeyboard.next();

            while(true) {
                Command CurrentClass = getCommandByName(string);
                CurrentClass.command();
                string = scannerKeyboard.next();
                if(string.equals("Break")) break;
            }
        }

    }

}
