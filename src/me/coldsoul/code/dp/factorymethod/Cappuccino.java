package me.coldsoul.code.dp.factorymethod;

import me.coldsoul.code.dp._util.LOGGER;

public class Cappuccino implements Coffee {

	@Override
	public void getName() {
		LOGGER.info("this is Cappuccino");
	}

}
