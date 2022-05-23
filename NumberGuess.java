package TEST;

import java.util.Scanner;

public class NumberGuess {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int g=0;
		try (Scanner sc = new Scanner(System.in)) {
			int num = (int) (Math.random() * 100);
			//System.out.println(num);
			System.out.println("Guess No..");
			System.out.println("You have 10 Chance to Got Number (Between 0-99)");
			for(i=0;i<10;i++) {
				System.out.println("Attempt No. "+(i+1)+" :");
				g=sc.nextInt();
				if(num==g) {
					System.out.println("Congratulations! You got it..");
					break;
				}
				else if(num>g) {
					System.out.println("Too Lower..");
				}
				else if(num<g) {
					System.out.println("Too Higher..");
				}
			}
		}
	}

}
