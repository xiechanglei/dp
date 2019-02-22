package me.coldsoul.code.dp.factory;

public class Factory {
	public static Car createCar(String type) {
		Car car = null;
		if ("bmw".equals(type)) {
			car = new Bmw();
		} else if ("benz".equals(type)) {
			car = new Benz();
		}
		return car;
	}
}
