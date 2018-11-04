package com.daniel.cwanek.Singleton;

public class God {
	private static God object = new God();
	
	private God() {};
	
	public static God getObject() {
		return object;
	}
}