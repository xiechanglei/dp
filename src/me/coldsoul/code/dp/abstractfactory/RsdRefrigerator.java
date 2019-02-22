package me.coldsoul.code.dp.abstractfactory;

import me.coldsoul.code.dp._util.LOGGER;

public class RsdRefrigerator implements Refrigerator {

	@Override
	public void getPower() {
		LOGGER.info("荣事达电冰箱 550w");
	}

}
