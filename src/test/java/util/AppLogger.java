package test.java.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.Reporter;

public class AppLogger {
	private String msgs = "";
	
	public void log(String msg) {
		msg = Thread.currentThread().threadId()
				+ " -- "
				+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"))
				+ " -- "
				+ msg;
		System.out.println(msg);
		Reporter.log("<br />" + msg);
		msgs = msgs + System.lineSeparator() + msg;
	}

	public String getAllMsgs() {
		return msgs;
	}
	
	public void reset() {
		msgs = "";
	}
}
