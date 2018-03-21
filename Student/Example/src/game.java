import java.util.Scanner;
public class game {

	public static void main(String[] args) 
	{
		Scanner op = new Scanner(System.in);
		System.out.println("Enter Your Action:");
		int Action =op.nextInt();
			
			switch(Action)
			{
			case 1:
				play();
				break;
			case 2:
				instruction();
				break;
			case 3:
				exit();
				break;
			default: System.out.println("Invalid option");
			break;
		}
	}
		

		
	private static void exit() {
		System.out.println("Exit from Game");
		
	}

	private static void play() {
		System.out.println("Play function invoked");
		
	}

	private static void instruction() {
		System.out.println("Instruction method is invoked");
		
	}
	}
	
	

