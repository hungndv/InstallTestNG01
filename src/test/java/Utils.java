package test.java;

public class Utils {
	public static void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			System.out.println("got interrupted!");
		}
	}
}
