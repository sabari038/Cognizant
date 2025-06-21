public class Logger {
private static volatile Logger instance;

 public static Logger getInstance() {
     if (instance == null) {
         synchronized (Logger.class) {
             if (instance == null) {
                 instance = new Logger();
             }
         }
     }
     return instance;
 }

 public void log(String message) {
     System.out.println("[" + System.currentTimeMillis() + "] " + message);
 }
}

