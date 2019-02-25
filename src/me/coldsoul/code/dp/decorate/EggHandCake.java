package me.coldsoul.code.dp.decorate;

public class EggHandCake extends HandCake {
	private HandCake handCake;

	public EggHandCake(HandCake handCake) {
		this.handCake = handCake;
	}

	@Override
	public String info() {
		return handCake.info() + ",鸡蛋";
	}

	@Override
	public int getPrice() {
		return handCake.getPrice() + 1;
	}
}
