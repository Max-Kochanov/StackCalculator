package methods;
import static main.MyStack.stack;

public class Pop implements Command{
    @Override
    public void command(){
        if(stack.empty()){
            System.out.println("The stack is empty");
            return;
        }
        stack.pop();
    }
}
