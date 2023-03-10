package commands.commandsWithoutArgument;

import interfaces.Command;
import interfaces.CommandWithoutArgument;
import executionManager.CollectionManager;

public class ClearCommand implements CommandWithoutArgument, Command {
    @Override
    public void execute() {
        CollectionManager.clear();
    }

    @Override
    public String getDescription() {
        return "clear : очистить коллекцию";
    }
}
