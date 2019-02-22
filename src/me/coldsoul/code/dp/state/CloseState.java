package me.coldsoul.code.dp.state;

import me.coldsoul.code.dp._util.LOGGER;

public class CloseState implements State {

	@Override
	public void action(Light light) {
		light.setState(new OpenState());
	}

	@Override
	public void show() {
		LOGGER.info("当前设备状态:关闭");
	}

}
