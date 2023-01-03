import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class School {
	Department department1 = new Department();

	
		List<Department> departmenList = new ArrayList<Department>();
	public List<Department> getDepartmenList() {
			return departmenList;
		}
		public void setDepartmenList(List<Department> departmenList) {
			this.departmenList = departmenList;
		}
	Scanner scanner = new Scanner(System.in);
	
	private String nameOfSchool;
	public String getNameOfSchool() {
		return nameOfSchool;
	}
	public void setNameOfSchool(String nameOfSchool) {
		this.nameOfSchool = nameOfSchool;
	}
	public int getIdOfSchool() {
		return idOfSchool;
	}
	public void setIdOfSchool(int idOfSchool) {
		this.idOfSchool = idOfSchool;
	}
	private int idOfSchool;
	
	



	
}
