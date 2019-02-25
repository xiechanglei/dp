package me.coldsoul.code.dp.observer;

public class Button {

	private ButtonListener buttonListener;

	public void setButtonListener(ButtonListener buttonListener) {
		this.buttonListener = buttonListener;
	}

	public void click() {
		if (this.buttonListener != null) {
			this.buttonListener.click();
		}
	}
}
