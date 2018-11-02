package methods;

import exceptions.StackException;

public interface Command {
    void command() throws StackException;
}
