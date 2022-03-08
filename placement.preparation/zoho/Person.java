package zoho;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;

	public Person(String name, String rollNo, int age, long phoneNumber) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		this.phoneNumber = phoneNumber;

	}

	private String rollNo;
	private int age;
	private long phoneNumber;
	private ArrayList<Person> person = new ArrayList<Person>();

	public List<Person> getPerson() {
		return person;
	}

	public void setPerson(List<Person> person) {
		this.person = (ArrayList<Person>) person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
