package Student;

public class Person {
	private int number;
	private String name;
	private String sex;
	private int age;

	public Person() {
		super();

	}

	public Person(int number, String name, String sex, int age) {
		super();
		this.number = number;
		this.name = name;
		this.sex = sex;
		this.age = age;

	}

	public int getNumber() {
		return number;

	}

	public void setNumber(int number) {
		this.number = number;

	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;

	}

	public String getSex() {
		return sex;

	}

	public void setSex(String sex) {
		this.sex = sex;

	}

	public int getAge() {
		return age;

	}

	public void getAge(int age) {
		this.age = age;

	}

	public String toString() {
		return "[编号：" + number + ",姓名：" + name + ",性别：" + sex + ",年龄：" + age
				+ "]";
	}
}
