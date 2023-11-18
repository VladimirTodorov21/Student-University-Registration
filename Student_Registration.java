/*This program registers the student to Concordia University by inputing first name, last name, date of birth,
 *verification of a vaccine passport, and department. Then a successful registration message is output along 
 *with the 7-digit randomly generated student ID. If user does not have covid vaccine passport, then a message 
 *is displayed hoping the user gets it soon. Lastly, the system thanks the user for using the program.
 *P.S. If the student is a returning student, system will only output a welcoming message and it thanks user for
 *using the program */

package assignment2;

import java.util.*; //Class needs to be imported

public class assignment2code1 
{	
	public static void main (String[] args)
	{
		Scanner registration = new Scanner(System.in);
		
		/*Header formatting for the University registration*/
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("      Welcome to Concordia University");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++\n");
		
		/*Prompts user to enter "yes" or "no" to whether user is a neecoming student at Concordia or not*/
		System.out.print("Are you a new coming student at Concordia? (yes or no)");
		String verification = registration.nextLine();
		String answer1 = "yes";
		String answer2 = "no";
		
		if (verification.equals(answer1)) 
		{
			System.out.println(); //blank space
			/*Prompts user to enter last name and first name in one string
			 * Source: https://www.quora.com/How-do-I-write-a-Java-program-to-prompt-the-user-to-print-his-full-name-as-first-name-last-name-and-print-each-word-in-a-line */
			System.out.print("Please enter your name (Lastname, Firstname separated by comma) : ");
			String lastandfirstname = registration.next();
			String [] strings1 = lastandfirstname.split(",");
			String lastname = strings1[0];
			String firstname = strings1[1];
			
			System.out.println(); //blank space
			/*Prompts user to enter date of birth in 2 strings*/
			System.out.print("Please enter your date of birth: ");
			String dateofbirth = registration.next();
			
			System.out.println(); //blank space
			/*Prompts user to enter either "true" or "false" to the question: Do you have covid vaccine passport? */
			System.out.print("Do you have covid19 vaccine passport? (true or false): ");
			String passportauthentication = registration.next();
			String answer3 = "false";
			boolean passportanswer = true;
			
			/*If answer is "false" boolean becomes false*/
			if (passportauthentication.equals(answer3))
			{
				passportanswer = false;
			}
			
			System.out.println(); //blank space
			/*Prompts user to type his or her department */
			System.out.print("Please enter your department: ");
			String department = registration.next();
			
			System.out.println(); //blank space
			System.out.println("Congratulations, " + firstname + " " + lastname + "! You have successfully registered at Concordia University!\n");
			
			/*Generates a random 7 digit number for the user
			 * Source: https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java */
			int min = 0;
			int max = 9999999;
			int SevenRandomDigits = (int)Math.floor(Math.random()*(max - min + 1) + min);
			System.out.println("Your student ID is " + SevenRandomDigits + ".\n");
			
			/*Condition: if boolean is false, then system will display a message*/
			if (passportanswer == false)
			{
				System.out.println(" Hope you will get your vaccine passport soon! Take care!");
				System.out.println(); //blank space
			}
			
			System.out.println("Thank you for using this Program!");
			
		}
		else if (verification.equals(answer2))
		{
			System.out.println();
			System.out.println("Welcome back! Hope you are having a great semester!\n");
			
			System.out.println("Thank you for using this Program!");
		}
		
		registration.close(); //close scanner
	} //end of main
} //end of public class
