package test.java;

import org.testng.Reporter;

public class AppLogger {
	private String msgs = "";
	
	public void log(String msg) {
		System.out.println(msg);
		Reporter.log(msg);
		msgs += msg;
	}

	public String getAllMsgs() {
		return msgs;
	}
	
	public void reset() {
		msgs = "";
	}
}
