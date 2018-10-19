package methods;
import static main.MyStack.stack;

public class Sum implements Command{
    @Override
    public void command(){
        double a = stack.pop();
        if(stack.empty()) {
            stack.push(a);
            return;
        }
        double b = stack.pop();
        stack.push(a+b);
    }
}
