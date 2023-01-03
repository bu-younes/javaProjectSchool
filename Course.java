import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Course implements Serializable {
	Mark mark1 = new Mark();

	
		List<Mark> markList = new ArrayList<Mark>();
       public List<Mark> getMarkList() {
			return markList;
		}
		public void setMarkList(List<Mark> markList) {
			this.markList = markList;
		}
		transient	Scanner scanner = new Scanner(System.in);
	
	
	private String courseSubject;
    public String getCourseSubject() {
		return courseSubject;
	}
	public void setCourseSubject(String courseSubject) {
		this.courseSubject = courseSubject;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	private int courseId;
	
	







	
	
	
}
