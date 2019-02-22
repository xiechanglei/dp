package me.coldsoul.code.dp.prototype;

public class School implements Cloneable {
	private String name;
	private String level;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public School(String name, String level) {
		super();
		this.name = name;
		this.level = level;
	}

	@Override
	public School clone() throws CloneNotSupportedException {
		return (School) super.clone();
	}

}
