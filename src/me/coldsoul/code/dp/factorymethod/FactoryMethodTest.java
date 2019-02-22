package me.coldsoul.code.dp.factorymethod;

public class FactoryMethodTest {
	public static void main(String[] args) {
		CoffeeFactory factory = null;
		Coffee coffee = null;

		factory = new LatteFactory();
		coffee = factory.makeCoffee();
		coffee.getName();

		factory = new CappuccinoFactory();
		coffee = factory.makeCoffee();
		coffee.getName();
	}
}
