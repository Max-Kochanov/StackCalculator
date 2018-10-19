package methods;
import static main.MyStack.stack;

public class Difference implements Command{
    @Override
    public void command(){
        double a = stack.pop();
        double b = stack.pop();
        stack.push(a-b);
    }
}