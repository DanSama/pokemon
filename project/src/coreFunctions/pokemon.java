package coreFunctions;

import java.util.Scanner();

public class pokemon {

	public static boolean gameplay = false;
	
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Welcome");
		System.out.println("1.) Start Game");
		System.out.println("2.) Load Game");
		System.out.println("3.) Settings");
		System.out.println("4.) Quit");
		int input = keyboard.nextInt();
		run(input);
	}
	
	public void run(int runCode) {
		if(runCode == 1) {
			while(gameplay = true) {
			
			
				gameplay = false;
			}
		}
	}

	
	
}
