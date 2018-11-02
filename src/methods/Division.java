package methods;

import exceptions.DivideByZeroException;
import exceptions.EmptyStackException;
import exceptions.StackException;
import static main.MyStack.stack;

public class Division implements Command {
    @Override
    public void command() throws StackException {
        if (stack.size() < 2) throw new EmptyStackException("Invalid amount of arguments");
        double a = stack.pop();
        double b = stack.pop();
        if (a == 0) throw new DivideByZeroException("Divide by zero");
        stack.push(a / b);
    }

}
