package com.generation;

import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );
        System.out.println( "Enter your name:  " );
        String name = console.next();
        
        System.out.println("Enter your lastname: ");
        String lastname = console.next();
        
        NameCharacters( name, lastname );
        printNameLength( name, lastname );
        fullname( name, lastname );
        console.close();
    }

    private static void printNameLength( String name, String lastname )
    {
        //TODO implement this code
    }

    private static void NameCharacters( String name, String lastname )
    {
       System.out.println("Your name is " +name);
       System.out.println("Your last name is "+ lastname);
      
    }
    
    private static void fullname( String name, String lastname ) {
    	System.out.println("Your full name is: " + name +" " + lastname);
    }
    


}