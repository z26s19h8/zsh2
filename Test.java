package Student;

public class Test {
	public static void main(String[] args){
		Teacher A1=new Teacher(01,"����","��",35);
		Student B1=new Student(02,"����","Ů",23);
		Course C1=new Course(202,"����","�ۺ�1¥","7:50","����");
			A1.setCourse(C1);
			B1.setCourses(C1);
			
			if(B1.getCourses().getCourseName()==null){
				
				System.out.println("ѧ���Ѿ��˿�");
			}else{
				System.out.println(A1);
				System.out.println(B1);
			}
	}
}
