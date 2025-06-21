public class TestLogger {
 public static void main(String[] args) {
     Logger logger1 = Logger.getInstance();
     Logger logger2 = Logger.getInstance();

     logger1.log("First message");
     logger2.log("Second message");

     System.out.println("logger1 hash: " + System.identityHashCode(logger1));
     System.out.println("logger2 hash: " + System.identityHashCode(logger2));

     if (logger1 == logger2) {
         System.out.println("Both logger1 and logger2 are the same instance.");
     } else {
         System.out.println("Different instances! Singleton failed.");
     }
 }
}
