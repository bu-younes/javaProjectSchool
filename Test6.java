
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		boolean departmentBoolean = true ;
		boolean teacherBoolean = true ;
		boolean studentBoolean = true ;
		boolean courseBoolean = true ;
		ArrayList<Department> departmentList = new ArrayList<Department>();
		Scanner scanner = new Scanner(System.in);
		Scanner moon = new Scanner(System.in).useDelimiter("\n");


		
		School school1 = new School();
		System.out.println("........welcome to school system.........");
		System.out.print("Enter Name Of School: ");
		school1.setNameOfSchool(scanner.nextLine());
		System.out.print("Enter Id Of School : ");
		school1.setIdOfSchool(scanner.nextInt());
		
		
		
		while(departmentBoolean) {
			
			Department department1 = new Department();
			System.out.print(" Enter Name Of Department : ");
			department1.setNameOfDepartment(scanner.next());
			System.out.print(" Enter Number Of Floors : ");
			department1.setNumberOfFloors(scanner.nextInt());

			
			
			
			while(teacherBoolean) {
				
				Teacher teacher1 = new Teacher();
				System.out.print(" Enter Teacher Name : ");
				teacher1.setTeacherName(scanner.next());
				System.out.print(" Enter Teacher Id : ");
				teacher1.setTeacherId(scanner.nextInt());
				
				
				
				
				
				
				while(studentBoolean) {
					
					Student student1 = new Student();
					System.out.print(" Enter Student Name : ");
					student1.setStudentName(scanner.next());
					System.out.print(" Enter Student Age : ");
					student1.setStudentAge(scanner.nextInt());
					
					
					
					
					while(courseBoolean) {
						
						Course course1 = new Course();
						System.out.print(" Enter Course Subject : ");
						course1.setCourseSubject(scanner.next());
						System.out.print(" Enter Course Id : ");
						course1.setCourseId(scanner.nextInt());
						System.out.print(" Enter Mark Of Course : ");
						course1.mark1.setMarkOfCourse(scanner.nextInt());
						
						
						
						
						
						
						
					student1.courseList.add(course1);
					System.out.print("Do You want another Course 1 if yes.> ");
					if(scanner.nextInt()!= 1) {
						courseBoolean = false;
					}

					}//while course
					
					
					
					
					teacher1.studentList.add(student1);
					System.out.print("Do You want another Student 1 if yes.> ");
					if(scanner.nextInt()!= 1) {
						studentBoolean= false;
					}
					courseBoolean=true;
					
				}//while student
				
				
				
			department1.teacherList.add(teacher1);
			System.out.print("Do You want another Teacher 1 if yes.> ");
			if(scanner.nextInt()!= 1) {
				teacherBoolean = false;
			}
			studentBoolean= true;
		
			}//while teacher
			
			
			departmentList.add(department1);
			System.out.print("Please Enter 1 to add more department :");
			teacherBoolean = true;
			departmentBoolean = true;
			if(scanner.nextInt()!= 1) {
				departmentBoolean = false;
		
				
			
			
			

			
			
			
			
			
			//printing
			
			System.out.println("(((((((((((( School Info ))))))))))))");
			System.out.println(">> School name is :" + school1.getNameOfSchool());
			System.out.println(">> School id is :" + school1.getIdOfSchool());
			
			    System.out.println("(((((((((((( Departments Info ))))))))))))");
            for(Department department :departmentList) {
               System.out.println("Department name is: " + department.getNameOfDepartment()+" ");
               System.out.println("Department floor is: " + department.getNumberOfFloors());
            for(Teacher teacher :department.teacherList) {
        		System.out.println("(((((((((((( Teacher Info ))))))))))))");
        		System.out.println(">> Teacher name is : " + teacher.getTeacherName());
        		System.out.println(">> Teacher id is : :" + teacher.getTeacherId());
        	for(Student student : teacher.studentList) {
        		System.out.println("(((((((((((( Student Info ))))))))))))");
        		System.out.println(">> Student name is : " +  student.getStudentName());
        		System.out.println(">> Student age is : :" + student.getStudentAge());
        	for(Course course : student.courseList) {
        		System.out.println(">> Course subject is : " +  course.getCourseSubject());
        		System.out.println(">> Course id is : :" + course.getCourseId());
        		System.out.println(">> Mark Of Course Is: :" + course.mark1.getMarkOfCourse());
			}//for course	
			}//for student
			}//for teacher
			
            }//for department
			
			}
		}//department while
		
		
		}}









