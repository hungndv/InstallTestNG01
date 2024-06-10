package test.java.util;

public class Helpers {
	public static void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			System.out.println("got interrupted!");
		}
	}
}
