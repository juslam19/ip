package duke.command;
import duke.task.*;
import duke.util.*;

/**
 * Class stores action to be taken for List command.
 */
public class ListCommand extends Command {

    /**
     * Displays using Ui numbered task from tasklist.
     *
     * @param tasklist list of tasks.
     * @param ui this instance of ui (which has open scanner).
     * @param storage instance of storage with chosen filepath.
     */
    public void execute(TaskList tasklist, Ui ui, Storage storage) {
        Ui.list(tasklist);
    }
}