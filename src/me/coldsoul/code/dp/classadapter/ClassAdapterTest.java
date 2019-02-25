package me.coldsoul.code.dp.classadapter;

public class ClassAdapterTest {
	public static void main(String[] args) {
		DC5 dc5 = new DC5AC220Adapter();
		System.out.println(dc5.output5V());
	}
}
