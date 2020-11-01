package Student;

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

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public String getPlace() {
		return Place;

	}

	public void seyplace(String place) {
		Place = place;

	}

	public String getTime() {
		return Time;

	}

	public void settime(String time) {
		Time = time;

	}

	public String getTeachTeacher() {
		return TeachTeacher;

	}

	public void setTeachTeacher(String teachTeacher) {
		TeachTeacher = teachTeacher;

	}

	public String toString() {
		return "\n\n�γ���Ϣ��[�γ̱�ţ�" + Id + "���γ����ƣ�" + CourseName + "���Ͽεص�:"
				+ Place + "���Ͽ�ʱ�䣺" + Time + "���ڿ���ʦ��" + TeachTeacher + "]";

	}
}
