package atm;

import java.util.Scanner;

public class AtmApp {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		Atm myAtm = new Atm (500, "1111");
		
		System.out.println("Enter your Pin");
		String enteredPin = input.nextLine();
	}

}
