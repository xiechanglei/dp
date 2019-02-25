package me.coldsoul.code.dp.interfaceAdapter;

public class InterfaceAdapterTest {
	public static void main(String[] args) {
		WindowListener listener = new WindowListenerAdapter() {
			@Override
			public void click() {
				System.out.println("click!");
			}
		};
		listener.click();

		listener = new WindowListenerAdapter() {
			@Override
			public void open() {
				System.out.println("this window opend");
			}
		};
		listener.open();
	}
}
