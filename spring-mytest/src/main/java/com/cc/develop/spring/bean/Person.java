package com.cc.develop.spring.bean;

/**
 * com.cc.develop.spring.bean
 *
 * @author changchen
 * @email java@mail.com
 * @date 2021-08-06 20:32:19
 */
public class Person {

	private Integer age;
	private String name;

	public Person() {
	}

	public Person(Integer age, String name) {
		this.age = age;
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person{" +
				"age=" + age +
				", name=" + name + "}";
	}
}
