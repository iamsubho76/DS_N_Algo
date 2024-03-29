package com.org.ds.v1.tree.binary.search.tree;

public class Person implements Comparable<Person> {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Person person) {
		return -(age - person.getAge());
	}

	@Override
	public String toString() {
		return this.name + "-" + this.age;
	}
}
