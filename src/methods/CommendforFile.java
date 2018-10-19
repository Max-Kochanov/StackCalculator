package methods;
import main.Main;

public class CommendforFile implements Command{
    String string;
    @Override
    public void command() {
        try {
            string = Main.scannerFile.next();
        }
        catch (Exception ex){
            System.out.println(ex + "Error in define");
        }
        System.out.println(string);
    }
}