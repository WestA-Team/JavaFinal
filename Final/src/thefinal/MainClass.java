package thefinal;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
  {
		// TODO Auto-generated method stub
		// Beginning screen that chooses the story you do
		
		displayMain();
	}
	public static void displayMain(){
		Scanner input = new Scanner(System.in);
		int choice = 0;
		
		System.out.println("'THIS IS THE BEST GAME EVER. JUST KIDDING'");
		
		System.out.println("Are you a boy(1) or a girl(2)>>> ");
		choice = input.nextInt();
		
		if (choice == 1)
		{
			Boy.boy();
		}
		if (choice == 2)
		{
			Girl.girl();
		}

			
	
	}
	
}



		

