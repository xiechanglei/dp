package me.coldsoul.code.dp.prototype;

public class Person implements Cloneable {
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

	@Override
	public Person clone() throws CloneNotSupportedException {
		Person p = (Person) super.clone();
		p.setSchool(school.clone());
		return p;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}
}
