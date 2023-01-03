import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File; // Import the File class
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


import java.io.Serializable;
public class Test22 {

		 
    // Main Method
   public static void main(String[] args)
   {
 
	  

		// TODO Auto-generated method stub
		
		 
	   System.out.println("-_-_-_-_-_-_-_-adding integer and string-_-_-_-_-_-_-_-");
		int num1 = 5;
	    int num2 = 6;
		Integer totalsum = num1 + num2 ;
		String e = Integer.toString(totalsum);
		
		
		String name= "Ali " + totalsum ;
		System.out.println("              the name and number is "+name);
		
	    System.out.println("-_-_-_-_-_--_-_-_-_-_-_-_--_-_-_-_-_-_-_--_-_-_-_-_-_-_-\n\n");
		
		
		 
	    

		boolean departmentBoolean = true ;
		boolean teacherBoolean = true ;
		boolean studentBoolean = true ;
		boolean courseBoolean = true ;
		boolean i = true ;

		ArrayList<Department> departmentList = new ArrayList<Department>();
		Scanner scanner = new Scanner(System.in);
		Scanner moon = new Scanner(System.in).useDelimiter("\n");
		Mark mark1 = new Mark();

       Stack<String> historylist = new Stack<>();


       
       
       
       
       while(i) {
			School school1 = new School();
			System.out.println("============Shcool System================");
			System.out.println("welcome to object chaining system");
			System.out.println("Select 1 to Enter the program");
			System.out.println("Select 2 to exit from the program ");
			System.out.println("Select 3 to get the History and to get a .txt file");
			System.out.println("Select 4 to have fixed constractor ");
			System.out.println("Select 5 to have constractor Enterd by the user");
       
       
       
       
       
       
       
       
		
			int select = scanner.nextInt();
			String selectt = Integer.toString(select);
			historylist.push(selectt);
			if (select == 1) {
		System.out.print("Enter Name Of School: ");
		school1.setNameOfSchool(scanner.next());
		System.out.print("Enter Id Of School : ");
		school1.setIdOfSchool(scanner.nextInt());
		
		
		
		while(departmentBoolean) {
			
			Department department1 = new Department();
			System.out.print(" Enter Name Of Department : ");
			String nameOfDepartment = scanner.next();
			department1.setNameOfDepartment(nameOfDepartment);
			historylist.push(nameOfDepartment);			
			System.out.print(" Enter Number Of Floors : ");
			int numberOfFloors = scanner.nextInt();
			String numberOfFloorss = Integer.toString(numberOfFloors);
			historylist.push(numberOfFloorss);
			department1.setNumberOfFloors(numberOfFloors);
			
			try
			{
			FileOutputStream file = new FileOutputStream("change1.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(department1);
			out.close();
			file.close();
			System.out.println("serialized and saved");
			
				
				
			}catch (Exception e1) {
				e1.printStackTrace();
			}
			
			
			
			try
			{
			FileInputStream file = new FileInputStream("change1.txt");
			ObjectInputStream in = new ObjectInputStream(file);
			
			 Department object1 = (Department) in.readObject();
			 System.out.println(object1.getNameOfDepartment());
			 System.out.println(object1.getNumberOfFloors());

			 
			in.close();
			file.close();
			
			System.out.println("object has been deserialized");
			System.out.println("Name Of Department:" + object1.getNameOfDepartment());
			System.out.println("Number Of Floors:" + object1.getNumberOfFloors());
			
			   }
		    catch(IOException ex)
		    {
		        System.out.println("IOException is caught");
		    }
		    catch(ClassNotFoundException ex)
		    {
		        System.out.println("ClassNotFoundException is caught");
			}
			
			
			
			while(teacherBoolean) {
				
				Teacher teacher1 = new Teacher();
				System.out.print(" Enter Teacher Name : ");
				String teacherName = scanner.next();
				teacher1.setTeacherName(teacherName);
				historylist.push(teacherName);				
				System.out.print(" Enter Teacher Id : ");
				int teacherId = scanner.nextInt();
				teacher1.setTeacherId(teacherId);
				String teacherIdd = Integer.toString(teacherId);
				historylist.push(teacherIdd);				
				
				
				
				try
				{
				FileOutputStream file = new FileOutputStream("change2.txt");
				ObjectOutputStream out = new ObjectOutputStream(file);
				out.writeObject(teacher1);
				out.close();
				file.close();
				System.out.println("serialized and saved");
				
					
					
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				
				
				
				try
				{
				FileInputStream file = new FileInputStream("change2.txt");
				ObjectInputStream in = new ObjectInputStream(file);
				
				 Teacher object1 = (Teacher) in.readObject();
				 System.out.println(object1.getTeacherName());
				 System.out.println(object1.getTeacherId());

				in.close();
				file.close();
				
				System.out.println("object has been deserialized");
				System.out.println("Teacher Name:" + object1.getTeacherName());
				System.out.println("Teacher Id:" + object1.getTeacherId());
				
				   }
			    catch(IOException ex)
			    {
			        System.out.println("IOException is caught");
			    }
			    catch(ClassNotFoundException ex)
			    {
			        System.out.println("ClassNotFoundException is caught");
				}
				
				
				
				
				while(studentBoolean) {
					
					Student student1 = new Student();
					System.out.print(" Enter Student Name : ");
					String studentName = scanner.next();
					student1.setStudentName(studentName);
					historylist.push(studentName);					
					
					System.out.print(" Enter Student Age : ");
					int studentAge = scanner.nextInt();
					student1.setStudentAge(studentAge);
					String studentAgee = Integer.toString(studentAge);
					historylist.push(studentAgee);					
					
					
					try
					{
					FileOutputStream file = new FileOutputStream("change3.txt");
					ObjectOutputStream out = new ObjectOutputStream(file);
					out.writeObject(student1);
					out.close();
					file.close();
					System.out.println("serialized and saved");
					
						
						
					}catch (Exception e1) {
						e1.printStackTrace();
					}
					
					
					
					try
					{
					FileInputStream file = new FileInputStream("change3.txt");
					ObjectInputStream in = new ObjectInputStream(file);
					
					 Student object1 = ( Student) in.readObject();
					 System.out.println(object1.getStudentName());
					 System.out.println(object1.getStudentAge());

					in.close();
					file.close();
					
					System.out.println("object has been deserialized");
					System.out.println("student name:" + object1.getStudentName());
					System.out.println("student age:" + object1.getStudentAge());
					
					   }
				    catch(IOException ex)
				    {
				        System.out.println("IOException is caught");
				    }
				    catch(ClassNotFoundException ex)
				    {
				        System.out.println("ClassNotFoundException is caught");
					}
					
					
					while(courseBoolean) {
						
						Course course1 = new Course();
						System.out.print(" Enter Course Subject : ");
						String courseSubject = scanner.next();
						course1.setCourseSubject(courseSubject);
						historylist.push(courseSubject);						
						
						System.out.print(" Enter Course Id : ");
						int courseId = scanner.nextInt();
						course1.setCourseId(courseId);
						String courseIdd = Integer.toString(courseId);
						historylist.push(courseIdd);						
						
						System.out.print(" Enter Mark Of Course : ");
						int markOfCourse = scanner.nextInt();
						mark1.setMarkOfCourse(markOfCourse);
						String markOfCoursee = Integer.toString(markOfCourse);
						historylist.push(markOfCoursee);						
						
						
						try
						{
						FileOutputStream file = new FileOutputStream("change4.txt");
						ObjectOutputStream out = new ObjectOutputStream(file);
						out.writeObject(course1);
						out.close();
						file.close();
						System.out.println("serialized and saved");
						
							
							
						}catch (Exception e1) {
							e1.printStackTrace();
						}
						
						
						
						try
						{
						FileInputStream file = new FileInputStream("change4.txt");
						ObjectInputStream in = new ObjectInputStream(file);
						
						 Course object1 = (Course) in.readObject();
						 System.out.println(object1.getCourseSubject());
						 System.out.println(object1.getCourseId());
						 System.out.println(object1.getMarkList());

						in.close();
						file.close();
						
						System.out.println("object has been deserialized");
						System.out.println("Course Subject:" + object1.getCourseSubject());
						System.out.println("Course Id:" + object1.getCourseId());
						System.out.println("Mark List:" + object1.getMarkList());

						   }
					    catch(IOException ex)
					    {
					        System.out.println("IOException is caught");
					    }
					    catch(ClassNotFoundException ex)
					    {
					        System.out.println("ClassNotFoundException is caught");
						}
						
						
						
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
	        		System.out.println(">> Mark Of Course Is: :" + mark1.getMarkOfCourse());
				}//for course	
				}//for student
				}//for teacher
				
	            }//for department
		
			}
			
				}
			
		}//department while
		
		//if school
       
			 else if (select == 3)
				{
					System.out.println("the input history is ");
					for (String v : historylist)
					{
						System.out.println(v);
					}
					
					try {
						
						BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
						writer.write("\nthis is your history list ");
						for (String v : historylist) {
							writer.write("\n"+v);
						}
						writer.close();
						}catch (IOException o) {
							o.printStackTrace();
						}
					
					
				}
				else if (select ==2 )
				{
					i = false ;
					System.out.println("the program is closed");
				}
				else if (select == 4)
				{
					System.out.println("=======constractor==============");
					Farm f = new Farm(" majid ","hisham ","adnan");
					
					System.out.println("============constractor program================");
				}
				else if (select == 5)
				{
					// constructer with user input
					Scanner sr = new Scanner(System.in);
					System.out.println("Enter the Animal name");
					String animal=sr.next();
					System.out.println("Enter the Animal age");
					int animalage=sr.nextInt();
				    Animal o = new Animal(animal,animalage);
				    System.out.println("===================================================\n\n");
				}
				else if (select == 6)
				{
					
					
				}
				}//while school
				scanner.close();
				
				
       }
       }

			









