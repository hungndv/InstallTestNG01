package test.java;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Singleton;

import test.java.pages.LoginPage;

public class TestModule implements Module {

	@Override
	public void configure(Binder binder) {
		binder.bind(AppLogger.class).in(Singleton.class);
	}

}
