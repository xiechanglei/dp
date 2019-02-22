package me.coldsoul.code.dp.abstractfactory;

public class RsdFactory implements WiringFactory {

	@Override
	public AirConditioner makeAirConditioner() {
		return new RsdAirConditioner();
	}

	@Override
	public Refrigerator makeRefrigerator() {
		return new RsdRefrigerator();
	}

}
