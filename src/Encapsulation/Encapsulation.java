package Encapsulation;

public class Encapsulation {

	private int rollNumber;
	private String name;
	private int age;

	public int gerRollNumber() {
		return rollNumber;
	}

	public void SetRollNumber(int rollNumber) {

		if (rollNumber <= 0) {
			System.err.println("invalid roll number:" + rollNumber);
		} else if (rollNumber <= 60 && rollNumber >= 1) {
			this.rollNumber = rollNumber;
		} else {
			System.err.println("invalid roll number+" + rollNumber);
		}
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		if (age >= 6 && age <= 17) {
			this.age = age;
		} else {
			System.err.println("invalid age" + age);
		}

	}

	public int getAge() {
		return age;
	}
}
