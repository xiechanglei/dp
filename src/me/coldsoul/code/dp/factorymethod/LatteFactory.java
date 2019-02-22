package me.coldsoul.code.dp.factorymethod;

public class LatteFactory implements CoffeeFactory {

	@Override
	public Coffee makeCoffee() {
		return new Latte();
	}

}
