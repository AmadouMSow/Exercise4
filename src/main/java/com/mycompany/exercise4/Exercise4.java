/* Create a app that accepts 2 mumbers from the user and returns the bigger btwn the 2. */
package com.mycompany.exercise4;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        //Declaration
        int num1, num2 ;
        //Create the scanner for the input
        Scanner scanner = new Scanner( System.in);
        System.out.print("Please enter a number: ");
        num1 = scanner.nextInt();
        System.out.print("Please enter a number: ");
        num2 = scanner.nextInt(); 
        //if statement to handle the comparison and output accordingly
        if( num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if ( num1 < num2 ) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println("ERROR");
        }
        //Close the scanner
        scanner.close();
    }
}
