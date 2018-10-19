package methods;
import main.Main;

public class DefineForFile implements Command{
    public static double digit;
    public static String letter;

    @Override
    public void command(){
        try {
            letter = Main.scannerFile.next();
            digit = Double.parseDouble(Main.scannerFile.next());
        }
        catch (Exception ex){
            System.out.println(ex + "Error in define");
        }
    }

}
