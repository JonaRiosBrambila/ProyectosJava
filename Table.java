package Loops;
import java.util.Scanner;

public class Table
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int num;
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
                
        System.out.println("Multiplication Table of " + num);
        
        int i=1;
        while(i<11) {
        	System.out.println(num+"x"+i+"="+i*num);
        	i++;
        }
        
       //TODO implement While loop to get print result
    }
}