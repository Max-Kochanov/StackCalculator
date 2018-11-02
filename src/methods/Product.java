package methods;

import exceptions.EmptyStackException;
import exceptions.StackException;
import static main.MyStack.stack;

public class Product implements Command {
    @Override
    public void command() throws StackException {
        double a;
        double b;
        if(stack.size() < 2) throw new EmptyStackException("Invalid amount of arguments");
        a = stack.pop();
        b = stack.pop();
        stack.push(a * b);
    }

}
