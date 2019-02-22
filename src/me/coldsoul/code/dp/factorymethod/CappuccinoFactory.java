package me.coldsoul.code.dp.factorymethod;

public class CappuccinoFactory implements CoffeeFactory {

	@Override
	public Coffee makeCoffee() {
		return new Cappuccino();
	}

}
