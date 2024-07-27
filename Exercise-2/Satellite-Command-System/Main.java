public class Main {
    public static void main(String[] args) {
        Satellite satellite = new Satellite();
        CommandExecutor executor = new CommandExecutor();

        // Executing commands
        executor.executeCommand(new RotateCommand(satellite, "South"));
        executor.executeCommand(new ActivatePanelsCommand(satellite));
        executor.executeCommand(new CollectDataCommand(satellite));
        executor.executeCommand(new DeactivatePanelsCommand(satellite));
        executor.executeCommand(new CollectDataCommand(satellite));
    }
}