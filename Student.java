import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Student {
	Course course1 = new Course();

	
	List<Course> courseList = new ArrayList<Course>();
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	Scanner scanner = new Scanner(System.in);
	
	
	 private String studentName;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	private	int studentAge;

	
		


		
		
	}


