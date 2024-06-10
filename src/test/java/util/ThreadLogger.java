package test.java.util;

/**
 * 
 */
public class ThreadLogger {
	private static final ThreadLocal<AppLogger> tlogger = new ThreadLocal<AppLogger>();
	
	public static AppLogger getLogger() {
		return tlogger.get();
	}
	
	public static void setLogger(AppLogger appLogger) {
		tlogger.set(appLogger);
	}
	
	public static void remove() {
		tlogger.remove();
	}
	
}
