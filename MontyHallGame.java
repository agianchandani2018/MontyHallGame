/**
* <This is the Monty Hall door game>
* @author Ami Gianchandani
* 
*/

import java.util.Scanner;
public class MontyHallGame
{
	public static void main(String[] args)
	{
	
	welcome();
	
	game();
	
	//simulations();
		
	
	}
	
	/**
	* <description> what? how?
	* 
	*
	*/
	public static void welcome()
	{
		System.out.println("Monty Hall Game");
		System.out.println("---Pick a door---");
		System.out.println("Switch if you dare");
		//print out 3 doors
		
	}
	
	public static void game()
	{
		Scanner kb = new Scanner(System.in); //getting user input
		int car = (int) (Math.random() * 3 + 1);
		
		//testing
		//System.out.println("CAR = " + car);
		
		System.out.print("Please choose a door: 1, 2, or 3:  ");
		int user_choice = kb.nextInt();
// 		if (user_choice > 3)
// 		{
// 			System.out.print("Please choose a door: 1, 2, or 3:  ");
// 			int user_choice = kb.nextInt();	
// 		}
		
		//get rid of new line from buffer
		kb.nextLine();
		
		//testing
		System.out.println("You chose door #" + user_choice);
		
		int reveal = doorToReveal1(car, user_choice);
		
		//testing
		System.out.println("Door " + reveal + " has a goat behind it");
		
		//ask if they want to switch
		System.out.print("Do you want to switch? yes or no: ");
		String answer = kb.nextLine();
		
		//testing
		System.out.println("The user wants to switch: " + answer);
		if(answer.equals("yes"))
		{
			user_choice = remainingDoor(user_choice, reveal);
		}
		
		if (car == user_choice)
		{
			System.out.println("You Win!");
		}
		else  //TODO: can put in anything but yes for no
		{
			System.out.println("Sorry! You Lose!!");
		}
		
	}
	
	/**
	* This method chooses the remaining door, not the user choice and not the door revealed that the user would switch to 
	* @param int c determines which door the car is in
	* @param int u assigns the users choice to a door
	* @return the door that isn't the users choice or the one with the car
	*/

	public static int remainingDoor(int c, int u)
	{
		//range = int(Math.random() * 3 + 1);
		
		for (int i = 1; i < 4; i++)
		{
			if (i != c && i != u)
			{
				return i;
			}
				
		}
		return 1;
	}
	
	/**
	* This method chooses either door, not just the first door as which door to reveal 
	* @param int c determines which door the car is in
	* @param int u assigns the users choice to a door
	* @return the door that isn't the users choice or the one with the car
	*/
	
	
	public static int doorToReveal1(int c, int u)
	{
		int r = (int) (Math.random() * 3 + 1);
		
		while (r == c || r == u)
		{
			r = (int) (Math.random()* 3 + 1);
		}
		return r;
	}
}
