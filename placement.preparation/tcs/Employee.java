package tcs;

public class Employee {
	private int id;
	private String name;
	private String designation;
	private int ssnNo;
	private int age;
	private double salary;
	private static int ssnNoCounter = 0;

	public Employee(int id, String name, String designation, int age, double salary) {
		ssnNoCounter += 1;
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.ssnNo = ssnNoCounter;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSsnNo() {
		return ssnNo;
	}

	public void setSsnNo(int ssnNo) {
		this.ssnNo = ssnNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static int getSsnNoCounter() {
		return ssnNoCounter;
	}

	public static void setSsnNoCounter(int ssnNoCounter) {
		Employee.ssnNoCounter = ssnNoCounter;
	}

	public static void main(String[] args) {
		Employee employee1 = new Employee(28, "bawczld", "rpiphga", 24, 218.0);
		System.out.println("Value of ssnNoCounter : " + Employee.getSsnNoCounter());
		Employee employee2 = new Employee(28, "sjfyirr", "wsexoca", 70, 493.0);
		System.out.println("Value of ssnNoCounter : " + Employee.getSsnNoCounter());
		Employee employee3 = new Employee(69, "xxtvzeg", "vhrnoxk", 68, 388.0);
		System.out.println("Value of ssnNoCounter : " + Employee.getSsnNoCounter());
		Employee employee4 = new Employee(27, "luydzvs", "husrfkh", 95, 887.0);
		System.out.println("Value of ssnNoCounter : " + Employee.getSsnNoCounter());
		Employee employee5 = new Employee(33, "ozduycg", "wjxzjzz", 67, 552.0);
		System.out.println("Value of ssnNoCounter : " + Employee.getSsnNoCounter());
	}

}
