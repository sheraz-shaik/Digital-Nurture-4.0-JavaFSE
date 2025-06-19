// Singleton class that provides a centralized logging utility
public class Logger {

    // Static variable to hold the single instance of Logger
    private static Logger singletonInstance;

    // Private constructor to restrict object creation from outside the class
    private Logger() {
        // Optional: Initialize logging configurations or resources
    }

    // Provides global access to the Logger instance with double-checked locking for thread safety
    public static Logger getInstance() {
        if (singletonInstance == null) {
            synchronized (Logger.class) {
                if (singletonInstance == null) {
                    singletonInstance = new Logger();
                }
            }
        }
        return singletonInstance;
    }

    // Outputs the provided message to the console
    public void writeLog(String logMessage) {
        System.out.println("Log Entry: " + logMessage);
    }
}
