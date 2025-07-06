package logger;

public class MainLoggerTest {
   public static void main(String[]arg)
   {
	   Logger log1 = Logger.getInst();
	   Logger log2 = Logger.getInst();
	   
	   log1.message("start the server.");
	   log2.message("user logging done.");
	   
	   
	   System.out.println("Testing both the instance is same ? "+(log1==log2) );
   }
}
