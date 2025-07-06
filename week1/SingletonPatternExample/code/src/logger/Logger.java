package logger;


public class Logger {
    private static Logger log;
    
    private Logger()
    {
       System.out.println("Logger is created");
    }
    
    public static Logger getInst()
    {
    	if(log == null)
    	{
    		log =  new Logger();
    	}
    	return log;
    }
    public void message(String str)
    {
    	System.out.println("Log: "+str);
    }
}
