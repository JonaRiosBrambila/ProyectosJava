package myfirstVariableNaming;

import java.util.Scanner;
import java.util.Calendar;


public class UserProfile {
	  public static void main(String[] args) {
		   Scanner scann = new Scanner(System.in);
		   System.out.println("Please enter your name ");
		   String name = scann.nextLine();
		   
		   System.out.println("Please enter your age ");
		   String age = scann.nextLine();     
		   int ageN = Integer.parseInt(age);
		   
		   System.out.println("Please enter your gender ");
		   String gender = scann.nextLine();
		   
		   System.out.println("Please enter your job preference ");
		   String job = scann.nextLine();
		   
		   System.out.println("Please enter your nationality ");
		   String nat = scann.nextLine();
		   
		   System.out.println("Please enter your blood type ");
		   String blood = scann.nextLine();
		   
		   Calendar date = Calendar.getInstance();
		    int year = date.get(Calendar.YEAR);

		   System.out.println("Your name is "+ name + ", you are " + age + " years old" + ", your gender is " + gender + " your job preference is " + job + " you are " + nat + ", your blood type is " + blood + " you born in " + date);

}
}


