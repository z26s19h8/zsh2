package Student;

public class Test {
	public static void main(String[] args){
		Teacher A1=new Teacher(01,"张三","男",35);
		Student B1=new Student(02,"李丽","女",23);
		Course C1=new Course(202,"高数","综合1楼","7:50","张三");
			A1.setCourse(C1);
			B1.setCourses(C1);
			
			if(B1.getCourses().getCourseName()==null){
				
				System.out.println("学生已经退课");
			}else{
				System.out.println(A1);
				System.out.println(B1);
			}
	}
}
