package me.coldsoul.code.dp.abstractfactory;

public class HaierFactory implements WiringFactory {

	@Override
	public AirConditioner makeAirConditioner() {
		return new HaierAirConditioner();
	}

	@Override
	public Refrigerator makeRefrigerator() {
		return new HaierRefrigerator();
	}

}
