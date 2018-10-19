package methods;
import static main.MyStack.stack;

public class Print implements Command {
    @Override
    public void command(){
        double a = stack.pop();
        System.out.println(a);
        stack.push(a);
    }
}
