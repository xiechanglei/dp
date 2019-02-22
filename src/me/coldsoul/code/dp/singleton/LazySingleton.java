package me.coldsoul.code.dp.singleton;

/**
 * 懒汉
 */
public class LazySingleton {
	private static LazySingleton lazySingleton = null;

	private LazySingleton() {

	}

	/**
	 * 第一次使用的时候创建
	 */
	public static LazySingleton getInstance() {
		if (lazySingleton == null) {
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}

	/**
	 * 线程安全优化,使用double-check-lock 进行线程安全优化，保证多线程环境下也只会创建一个实例出来
	 */
	public static LazySingleton getInstance2() {
		if (lazySingleton == null) {
			synchronized (LazySingleton.class) {
				if (lazySingleton == null) {
					lazySingleton = new LazySingleton();
				}
			}
		}
		return lazySingleton;
	}
}
