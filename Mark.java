import java.io.Serializable;
import java.util.Scanner;

class Mark implements Serializable{
	
  private int markOfCourse;
  
  
  transient	Scanner scanner = new Scanner(System.in);


	public int getMarkOfCourse() {
		return markOfCourse;
	}


	public void setMarkOfCourse(int markOfCourse) {
		this.markOfCourse = markOfCourse;
	}
	
	
	
	
	

	
	
}
