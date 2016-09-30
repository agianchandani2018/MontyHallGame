
/**
* @author Ami
* @date September 28, 2016
*
**/

public class MontyHallSimulation
{
	public static void main(String[] args)
	{
	//System.out.println(args[0]);
	//System.out.println(args[1]);
	
	int numSim = Integer.parseInt(args[0]);

	int switchWin = 0;

	for(int i = 0; i < numSim; i ++)
		switchWin += game();
		
	double percentSwitchWin = (double) switchWin / numSim * 100;	
	percentSwitchWin = format(percentSwitchWin) ;
	
	double percentStayWin = 100 - percentSwitchWin;
	percentStayWin = format(percentStayWin);
		
	System.out.println("% of switch wins is : " + percentSwitchWin + "%");
	System.out.println("% of stay wins is : " + percentStayWin + "%");
	
	}
	
	/**
	* Takes in a double and truncates it to only 2 decimal places
	* @param d the double input to be truncated
	* @return double formatted to 2 decimal places
	*/
	public static double format(double d)
	{
		int n = (int)(d * 100);
		//double t = (double)(n / 100);
		return n / 100.0;
		
	
	}
	
	/**
	*
	* @return int return 1 if switch win, otherwise 0
	*/	
		public static int game()
		{
			int car = (int)(Math.random()* 3 + 1);
			int userChoice = (int)(Math.random()* 3 + 1);
		
			if (userChoice == car) //we are assuming they switch every time
				return 0;
			else
				return 1;	
	
		}


}

