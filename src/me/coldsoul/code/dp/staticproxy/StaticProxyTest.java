package me.coldsoul.code.dp.staticproxy;

public class StaticProxyTest {
	public static void main(String[] args) {
		TableManager manager = new TransationProxyForTableManager(new StudentTableManager());
		manager.empty();
		manager = new TransationProxyForTableManager(new TeacherTableManager());
		manager.empty();
	}
}
