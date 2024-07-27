public class CommandExecutor {
    public void executeCommand(Command command) {
        try {
            command.execute();
        } catch (Exception e) {
            System.err.println("Error executing command: " + e.getMessage());
        }
    }
}