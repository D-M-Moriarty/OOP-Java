/*This program carries out a quadratic equation*/

import java.util.Scanner;

public class PS15 {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		double quad = quadEquationPlus(1,6,-16);
		
		double quad2 = quadEquationMinus(1,6,-16);
		
		System.out.print("X = "+quad+"\n\n"+"X = "+quad2);
	}
	
	public static double quadEquationPlus(double a, double b, double c){
		return ((-b)+(Math.sqrt((b*b)-(4*a*c)))/(2*a));
	}
	
	public static double quadEquationMinus(double a, double b, double c){
		return ((-b)-(Math.sqrt((b*b)-(4*a*c)))/(2*a));
	}
}