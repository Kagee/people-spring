package no.hild1.spring;

import javax.validation.constraints.Size;

public class Person {
	@Size(min = 5, max = 30, message = "Fo bar must be 5 or 30 or between")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public String toString() {
		return "Person's name: " + name;
	}
}