package me.coldsoul.code.dp.state;

public class Light {
	private State state;

	public void setState(State state) {
		this.state = state;
	}

	public Light(State state) {
		this.state = state;
	}

	public void showState() {
		state.show();
	}

	public void changeState() {
		state.action(this);
	}

}
