public class ListCommand implements Command{
    private boolean isExitCommand = false;
    private TaskList taskList;

    public ListCommand() {
    }

    @Override
    public boolean isExitCommand() {
        return isExitCommand;
    }

    @Override
    public TaskList runCommand(TaskList taskList) {
        this.taskList = taskList;
        return taskList;
    }

    @Override
    public String getResponse() {
        return this.taskList.toString();
    }
}