package methods;

import exceptions.EmptyStackException;
import exceptions.StackException;

import static main.MyStack.stack;

public class Pop implements Command {
    @Override
    public void command() throws StackException {
        if (stack.size() < 1) throw new EmptyStackException("The stack is empty");
        stack.pop();
    }
}
