package ProgramacionFundamentos;

public class Student {
	//1- Create a new Java project using IntelliJ Idea.
	//2- Create a Student class. This class must have the following attributes:
	//Atributos
	private String firstName;
	private String lastName;
	private int registration;
	private int grade;
	private int year;
	
	public static void main(String[]args) {
		Student karen = new Student ("Karen","loy",22,66,2022);
		System.out.println("hi " +karen.printFullName()+ " Approved: " + karen.isApproved()+ " Status: " + karen.changeYearIfApproved() + " Registration: " + karen.registration());
	}
	   // 4-Agrega constructores a tu clase Student:
		//constructor
	public Student (String firstName, String lastName, int registration, int grade, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	}
	
	// 3-Now, make the Student class implement the following methods:
	   public String printFullName(){
		      return this.firstName+ " " + this.lastName;
		   }

	   public boolean isApproved(){
		       //TODO implement: should return true if grade >= 60
		   if(grade >=60 ) {
			   return true;
		   } else {
			   return false;
		   }
		   
		  }

	   public String changeYearIfApproved(){
		   //TODO implement: the student should advance to the next year if he/she grade is >= 60
		   // Make year = year + 1, and print "Congragulations" if the student has been approved
		   if (grade >= 60) {
			   year = this.year + 1;
			   return "Congratulations " + this.firstName + " you advanced to " +year ;
		   } else {
		   return "not advance" ; 
		   }
}
	   public int registration() {
		   return registration;
	   }
}