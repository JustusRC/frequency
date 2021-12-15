package p2.thirteen;

import java.util.Scanner;

public class cs234 {

	public static void main(String[] args) {
		
		
		
		//Justus Contreras
		//P2.13
		//cs234
		
		
		//Declaration Variables
		double cMax, cMin, C, f, L, fMax, fMin;
		
		
		//Allows user input
		Scanner pam = new Scanner (System.in);
		//Asks for user to enter frequency in hertz
		System.out.print("Enter the frequency in hertz: ");
		f=pam.nextDouble();
		//Asks for user minimum capacitance
		System.out.print("Enter minimum capacitance: ");
		cMin=pam.nextDouble();
		//Asks for user maximum capacitance
		System.out.print("Enter maximum capacitance: ");
		cMax=pam.nextDouble();
		
		
		//Formula to find C
		C =Math.sqrt(cMin * cMax);
		//Formula to find Inductance
		L = (4 * Math.pow(Math.PI, 2)) / (Math.pow(f, 2) * C);
		//Formula to find fMax
		fMax= (2*Math.PI)/(Math.sqrt(f*cMin));
		//Formula to find fMin
		fMin= (2*Math.PI)/(Math.sqrt(f*cMax));
		
		
	
		//Output
		System.out.println("Required Inductance: "+L);
		System.out.println("Frequency Range varies from " +fMin+ " to " +fMax);


		
		
		
		
		
		
		
		
		
		
		
		

	}

}
