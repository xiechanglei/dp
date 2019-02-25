package me.coldsoul.code.dp.decorate;

public class DecorateTest {
	public static void main(String[] args) {
		HandCake handCake = new HandCake();
		handCake.desc();

		handCake = new EggHandCake(handCake);
		handCake.desc();

		handCake = new HamHandCake(handCake);
		handCake.desc();
	}
}
