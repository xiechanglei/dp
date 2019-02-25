package me.coldsoul.code.dp.observer;

public class ObserverTest {
	public static void main(String[] args) {
		Button button = new Button();
		button.setButtonListener(new ButtonListener() {
			@Override
			public void click() {
				System.out.println("button click");
			}
		});

		button.click();
	}
}
