package methods;
import static main.MyStack.stack;

public class Sqrt implements Command{
    @Override
    public void command() {
        double a = stack.pop();
        a = Math.sqrt(a);
        stack.push(a);
    }
}
