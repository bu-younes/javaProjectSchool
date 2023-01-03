import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Teacher implements Serializable {
	Student student1 = new Student();


		List<Student> studentList = new ArrayList<Student>();
	public List<Student> getStudentList() {
			return studentList;
		}
		public void setStudentList(List<Student> studentList) {
			this.studentList = studentList;
		}
transient	Scanner scanner = new Scanner(System.in);

	
	
	private String teacherName;
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	private int teacherId;
	


	

	
}
