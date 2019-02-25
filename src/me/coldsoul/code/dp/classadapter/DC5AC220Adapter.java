package me.coldsoul.code.dp.classadapter;

public class DC5AC220Adapter extends AC220 implements DC5 {

	@Override
	public int output5V() {
		return outPut220() / 44;
	}

}
