import java.util.ArrayList;
import java.util.Scanner;

class Department {
	Teacher teacher1 = new Teacher();

	
		ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
    public ArrayList<Teacher> getTeacherList() {
			return teacherList;
		}
		public void setTeacherList(ArrayList<Teacher> teacherList) {
			this.teacherList = teacherList;
		}
	Scanner scanner = new Scanner(System.in);
	
	private String nameOfDepartment;
	public String getNameOfDepartment() {
		return nameOfDepartment;
	}
	public void setNameOfDepartment(String nameOfDepartment) {
		this.nameOfDepartment = nameOfDepartment;
	}
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}
	private int numberOfFloors;
	
	

	
	
	

		
	}






