# 计G201 朱烁恒 2020322080-
第二次Java作业

## 实验目的
了解面向对象的设计方法
学会使用super（）、toString（），继承、构造、实例化

## 实验要求
说明：学校有“人员”，分为“教师”和“学生”，家伙死教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，没门课程的授课教师也仅有一位，每名学生选仅一门课程。
对象：人员（编号、姓名、性别、年龄）
      教师（编号、姓名、性别、年龄）
      学生（编号、姓名、性别、年龄）
      课程（编号、课程名称、上课地点、上课时间、授课老师）
      
## 实验过程
运用了super（）实例化，toString（）信息输出还有继承构造的方法

## 核心代码
```
public Person(int number, String name, String sex, int age) {
		super();
		this.number = number;
		this.name = name;
		this.sex = sex;
		this.age = age;

	}
  ```
  ```
  public String toString() {
		return "[编号：" + number + ",姓名：" + name + ",性别：" + sex + ",年龄：" + age
				+ "]";
	}
  ```
  ```
  public String toString() {
		return "教师信息：" + super.toString();

	}
  ```
  ```
  public class Course {
	private int Id;
	private String CourseName;
	private String Place;
	private String Time;
	private String TeachTeacher;

	public Course() {
		super();

	}

	public Course(int Id, String CourseName, String Place, String Time,
			String TeachTeacher) {
		super();
		this.Id = Id;
		this.CourseName = CourseName;
		this.Place = Place;
		this.Time = Time;
		this.TeachTeacher = TeachTeacher;
	}
  ```
  ```
  public String toString() {
		return "\n\n课程信息：[课程编号：" + Id + "，课程名称：" + CourseName + "，上课地点:"
				+ Place + "，上课时间：" + Time + "，授课老师：" + TeachTeacher + "]";

	}
  ```
  ```
  public class Student extends Person{
	private Course Courses;
	public Student(){
		super();
	}
  ```
  
  ## 编程感想
  通过这次实验，我学会了子类与父类，子类的继承性、super关键字等，更加熟练的运用Java知识。

  
