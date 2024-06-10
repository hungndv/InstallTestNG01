package test.java;

import org.testng.annotations.Guice;

@Guice(modules = TestModule.class)
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
