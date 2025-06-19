//Aim: You need to ensure that a logging utility class in your application has only one instance throughout the application lifecycle to ensure consistent logging.

class Logger {

    // Creating a private static instance
    private static Logger instance = null;

    // Private constructor to prevent object creation from outside
    private Logger() {
        System.out.println("Logger Instance Created");
    }

    // Public static method to provide the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); 
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log Message: " + message);
    }
}
public class SingletonPatternExample {
    public static void main(String[] args) {
        // Get the single instance of Logger
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");

        // Try to get another instance
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

        // Validate both references point to the same object
        System.out.println("Are both loggers the same instance? " + (logger1 == logger2));
    }
}

