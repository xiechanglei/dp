package me.coldsoul.code.dp.abstractfactory;

import me.coldsoul.code.dp._util.LOGGER;

public class HaierRefrigerator implements Refrigerator {

	@Override
	public void getPower() {
		LOGGER.info("海尔电冰箱 500w");
	}

}
