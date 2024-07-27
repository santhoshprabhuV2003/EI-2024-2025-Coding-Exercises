public class LoggerAdapter implements NewLogger {
    private OldLogger oldLogger;

    public LoggerAdapter(OldLogger oldLogger) {
        this.oldLogger = oldLogger;
    }

    @Override
    public void logInfo(String message) {
        oldLogger.log("INFO", message);
    }

    @Override
    public void logWarn(String message) {
        oldLogger.log("WARN", message);
    }

    @Override
    public void logError(String message) {
        oldLogger.log("ERROR", message);
    }
}