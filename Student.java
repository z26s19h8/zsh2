package Student;

public class Student extends Person{
	private Course Courses;
	public Student(){
		super();
	}
	public Student(int number,String name,String sex,int age){
		super(number,name,sex,age);
	}
	public Course getCourses(){
		return Courses;
		
	}
	public void setCourses(Course Courses){
		this.Courses=Courses;
	}
	public String toString(){
		return "\nÑ§Éú£º"+super.toString()+Courses;
		
	}
}
