package me.coldsoul.code.dp.prototype;

import java.io.IOException;

public class PrototypeTest {
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		Person person = new Person("zhangsan", "china", new School("安徽工程大学", "一本"));
		Person clone = person.clone();

		person.setName("lisi");
		person.getSchool().setName("安徽师范大学");

		System.out.println(clone.getName());
		System.out.println(clone.getSchool().getName());

		Person clone2 = person.clone2();

		person.setName("wangwu");
		person.getSchool().setName("安徽理工大学");
		
		System.out.println(clone2.getName());
		System.out.println(clone2.getSchool().getName());
		
	}
}
