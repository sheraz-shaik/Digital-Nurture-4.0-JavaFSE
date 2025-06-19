// Class to test the Logger singleton functionality
public class SingletonTest {

    public static void main(String[] args) {
        // Retrieve Logger instances
        Logger firstLoggerRef = Logger.getInstance();
        Logger secondLoggerRef = Logger.getInstance();

        System.out.println();

        // Verify both references point to the same object
        if (firstLoggerRef == secondLoggerRef) {
            System.out.println("Both Logger references are identical (singleton confirmed).");
        } else {
            System.out.println("Logger references are different (singleton violated).");
        }

        // Log sample messages using the singleton instance
        firstLoggerRef.writeLog("Initial test log message.");
        secondLoggerRef.writeLog("Subsequent test log message.");
    }
}
