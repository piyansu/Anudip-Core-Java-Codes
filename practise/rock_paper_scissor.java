package practise;

import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int mypoint = 0, comppoint = 0  , time = 1 ;
		
		System.out.println("Welcome to Rock - Paper - Scissor Game 🙂🤗");
		System.out.println("Enter How many rounds you want : ");
		int round = sc.nextInt() ;
		while(round > 0 ) {
			System.out.println("\nRound "+time);
			System.out.println("-------");
			System.out.println("1.Rock");
			System.out.println("2.Paper");
			System.out.println("3.Scissor");
			System.out.println("Enter Your Choice : ");
			int choice = sc.nextInt();
			
			Random random = new Random();			
	        // Generate a random number between 1 and 3
	        int compchoice = random.nextInt(3) + 1;
	        
	        // 1st type
	        if(choice == 1 && compchoice == 1)
	        	System.out.println("\nIts Draw");
	        else if(choice == 1 && compchoice == 2) {
	        	System.out.println("\nComputer Wins");
	        	System.out.println("Computer Choosed Paper");
	        	comppoint ++ ; 
	        	System.out.println("Your Point : "+mypoint);
	        	System.out.println("Computer Point : "+comppoint);
	        	
	        }
	        else if(choice == 1 && compchoice == 3) {
	        	System.out.println("\nYou Wins");
	        	System.out.println("Computer Choosed Scissor");
	        	mypoint ++ ; 
	        	System.out.println("Your Point : "+mypoint);
	        	System.out.println("Computer Point : "+comppoint);
	        }
	        
	        // 2nd type
	        else if(choice == 2 && compchoice == 1) {
	        	System.out.println("\nYou Wins");
	        	System.out.println("Computer Choosed Rock");
	        	mypoint++ ;
		        System.out.println("Your Point : "+mypoint);
	        	System.out.println("Computer Point : "+comppoint);
	        }
	        else if(choice == 2 && compchoice == 2)
	        	System.out.println("\nIts Draw");
	        else if(choice == 2 && compchoice == 3) {
	        	System.out.println("\nComputer Wins");
	        	System.out.println("Computer Choosed Scissor");
	        	comppoint ++ ; 
	        	System.out.println("Your Point : "+mypoint);
	        	System.out.println("Computer Point : "+comppoint);
	        }
	        
	        // 3rd type
	        else if(choice == 3 && compchoice == 1) {
	        	System.out.println("\nComputer Wins");
	        	System.out.println("Computer Choosed Rock");
	        	comppoint ++ ; 
		        System.out.println("Your Point : "+mypoint);
	        	System.out.println("Computer Point : "+comppoint);
	        }
	        else if(choice == 3 && compchoice == 2) {
	        	System.out.println("\nYou Wins");
	        	System.out.println("Computer Choosed Paper");
	        	mypoint ++ ; 
	        	System.out.println("Your Point : "+mypoint);
	        	System.out.println("Computer Point : "+comppoint);
	        }
	        else if(choice == 3 && compchoice == 3)
	        	System.out.println("\nIts Draw");
	        
	        System.out.println("-------------");
	        System.out.println("After Round "+time); 
	        System.out.println("-------------");
	        System.out.println("Your Point : "+mypoint);
        	System.out.println("Computer Point : "+comppoint);
	        	
	        round -- ; 
	        time ++ ;
		}
		
		if(mypoint > comppoint)
			System.out.println("Congrats!! You Win");
		else if(mypoint == comppoint)
			System.out.println("It's Draw");
		else
			System.out.println("Sorry!! Computer Win");
		
		
	}

}
