package me.coldsoul.code.dp.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Cloneable, Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String country;
	private School school;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Person(String name, String country, School school) {
		this.name = name;
		this.country = country;
		this.school = school;
	}

	/**
	 * 使用java自带的clone 方法copy，缺点是复杂类型的成员变量类型需要实现CloneAble接口，然后挨个去覆写Object类的clone的方法
	 */
	@Override
	public Person clone() throws CloneNotSupportedException {
		Person p = (Person) super.clone();
		p.setSchool(school.clone());
		return p;
	}

	/**
	 * 使用序列化与反序列化的方式copy对象，缺点是复杂类型的成员变量按个需要实现Serializable 接口
	 * 
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Person clone2() throws IOException, ClassNotFoundException {
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);

		ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		Person p = (Person) ois.readObject();

		oos.close();
		ois.close();

		return p;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}
}
