public class Main {
    public static void main(String[] args) {
        OldLogger oldLogger = new OldLogger();
        NewLogger logger = new LoggerAdapter(oldLogger);

        logger.logInfo("This is an info message.");
        logger.logWarn("This is a warning message.");
        logger.logError("This is an error message.");
    }
}