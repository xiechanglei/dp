package me.coldsoul.code.dp.decorate;

public class HamHandCake extends HandCake {
	private HandCake handCake;

	public HamHandCake(HandCake handCake) {
		this.handCake = handCake;
	}

	@Override
	public String info() {
		return handCake.info() + ",火腿";
	}

	@Override
	public int getPrice() {
		return handCake.getPrice() + 3;
	}
}
