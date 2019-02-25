package me.coldsoul.code.dp.decorate;

public class HandCake {
	public String info() {
		return ("手抓饼");
	}

	public int getPrice() {
		return 4;
	}

	public void desc() {
		System.out.println(info() + "\t" + getPrice() + "元");
	}
}
