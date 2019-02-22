package me.coldsoul.code.dp.abstractfactory;

import me.coldsoul.code.dp._util.LOGGER;

public class HaierAirConditioner implements AirConditioner {

	@Override
	public void getName() {
		LOGGER.info("海尔空调");
	}

}


