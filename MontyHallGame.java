import java.util.Scanner;
public class MontyHallGame
{
	public static void main(String[] args)
	{
	
	welcome();
	
	game();
	
	//doorToReveal(car, user_choice);
	
	
	}
	
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
		System.out.println("CAR = " + car);
		
		System.out.print("Please choose a door: 1, 2, or 3:  ");
		int user_choice = kb.nextInt();
		//get rid of new line from buffer
		kb.nextLine();
		
		System.out.println("You chose door #" + user_choice);
		
		int reveal = doorToReveal(car, user_choice);
		
		System.out.println("Door " + reveal + " has a goat behind it");
		
		
	}
	

	public static int doorToReveal(int c, int u)
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



}
