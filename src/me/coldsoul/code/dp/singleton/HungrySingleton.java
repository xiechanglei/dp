package me.coldsoul.code.dp.singleton;

/**
 * 饿汉
 */
public class HungrySingleton {
	private static HungrySingleton hungrySingleton = new HungrySingleton();

	private HungrySingleton() {

	}

	public static HungrySingleton getInstance() {
		return hungrySingleton;
	}
}
