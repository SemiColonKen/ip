package main.java;

public class ExitCommand extends Command {

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {

    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
