package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int menuSelection =0;
		double convertFrm;

		
		while (menuSelection != 4) {
			System.out.println("Please select a convertion: \n 1. Pounds to Ounces.\n 2. Miles to"
					+ " Kilometers. \n 3. Inches to Milimeters.\n 4. Quit.");
			menuSelection = scanner.nextInt();
			
			switch(menuSelection){
			
			case 1: {
				System.out.println("Pounds to Ounces\nPlease enter the of Pounds: ");
				convertFrm = scanner.nextDouble();
				System.out.println("ANSWER = "+ convertFrm + " Pounds(s) converts into "+ convertFrm*16 + " Ounces\n");
			break;
			}
			case 2:{
				System.out.println("Miles to Kilometers\nPlease enter the number of Miles: ");
				convertFrm = scanner.nextDouble();
				System.out.println("ANSWER = "+ convertFrm + " Mile(s) converts into "+ convertFrm*1.609 + " Kilometers\n");
			break;
			}
	    	case 3: {
	    		System.out.println("Inches to Feet\nPlease enter the number of Inches: ");
				convertFrm = scanner.nextDouble();
				System.out.println("ANSWER = "+ convertFrm + " inch(es) converts into "+ convertFrm*25.4 + " Milimeters\n");
	    	break;	    	
			}
			
		}
		
    	
		}
		scanner.close();
	}
}
		
		

