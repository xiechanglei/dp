package me.coldsoul.code.dp.abstractfactory;

import me.coldsoul.code.dp._util.LOGGER;

public class RsdAirConditioner implements AirConditioner {

	@Override
	public void getName() {
		LOGGER.info("荣事达空调");
	}

}
