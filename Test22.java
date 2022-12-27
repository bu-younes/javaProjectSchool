import java.util.Scanner;

public class Test22 {

		 
    // Main Method
   public static void main(String[] args)
   {
 

	   Scanner Sc = new Scanner(System.in);
	   boolean menu= true;
	   
	   while(menu){
	   System.out.println("1.Enter shop details");
	   System.out.println("2.Enter product details");
	   System.out.println("3.Enter item details");
	   System.out.println("4.History");
	   System.out.println("5.Exit");
	   System.out.println("6.Display product");
	   System.out.println("7.Remove duplicate product name");
	   int input = Sc.nextInt();
	   if (input == 1) {
	   System.out.println("shop details");
	   }
	   else if(input==2){
		   menu = true;
	   System.out.println("product details");
	   }
	   else if(input==3){
		   menu =true;
		   System.out.println("item details");
		   }
	   else if(input==4){
		   menu = true;
		   System.out.println("History");
		   }
	   else if(input==5){
		   menu = false;
		   System.out.println("Exit");
		   }
	   else if(input==6){
		   menu = true;
		   System.out.println("Display product");
		   }
	   else if(input==7){
		   menu = true;
		   System.out.println("duplicate product name");
		   }
	   else {
	   System.out.println("wrong choice");
	  
	   }
	   }
  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   }}



	   // Creating an empty Stack
      /*   Stack<String> stackStr = new Stack<String>();
	  	String name = scanner.nextLine();
		school1.setNameOfSchool(name);
		stackparee.push(name);*/