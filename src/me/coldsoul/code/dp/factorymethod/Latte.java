package me.coldsoul.code.dp.factorymethod;

import me.coldsoul.code.dp._util.LOGGER;

public class Latte implements Coffee {

	@Override
	public void getName() {
		LOGGER.info("this is latte");
	}

}
