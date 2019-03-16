//package mycode;
import java.util.Scanner;
public class Fraction {
	//attributes
	private int numerator;
	private int denominator;	
	
	// scanner object
	Scanner input = new Scanner(System.in);
	
	//constructors
	public Fraction() {
		System.out.println("Enter the next numerator, denominator of your fraction");
		numerator = input.nextInt();
		denominator = input.nextInt();
	}
	public Fraction(int a, int b) {
		numerator = a;
		denominator = b;
	}
	
	
	//methods
	public String add(Fraction snum, Fraction num1) {		
		int numerator, denominator;
		numerator = num1.numerator * snum.denominator + snum.numerator*num1.denominator;
		denominator = num1.denominator*snum.denominator;
		return simplified(numerator, denominator);
	}
	// method to subtract to fractions
	public String subtract(Fraction snum, Fraction num1) {
		int numerator, denominator;
		numerator = num1.numerator * snum.denominator - snum.numerator*num1.denominator;
		denominator = num1.denominator*snum.denominator;
		return simplified(numerator, denominator);
	}
	//method to multiply two fractions
	public String multiply(Fraction snum, Fraction num1) {	
		int numerator, denominator;
		numerator = num1.numerator * snum.numerator;
		denominator = num1.denominator*snum.denominator;
		return simplified(numerator, denominator);
	}
	// method to divide two fractions
	public String divide(Fraction snum, Fraction num1) {	
		int numerator, denominator;
		numerator = num1.numerator * snum.denominator;
		denominator = num1.denominator*snum.numerator;
		return simplified(numerator, denominator);
	}
	// method to return a simplified form of a fraction given numerator and denominator
	public String simplified(int n, int d) {
		for (int i=2; i<=Math.abs(n); i++) {
			if ( n%i == 0 && d%i == 0) {
				d = d/i;
				n = n/i;
				i = 1;
			}
		}
		if (n<=d && n!=0) {
			return Integer.toString(n) + "/" + Integer.toString(d);
		}
		else if( n==0 ) {
			return Integer.toString(0);
		}
		else {
			return Integer.toString(n/d) + "/" + Integer.toString(n%d) + "/" + Integer.toString(d);
		}
	}
	// main method
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		Fraction num2;
		System.out.println("Enter numerator, denominator of your fraction");
		num2 = new Fraction(input.nextInt(),input.nextInt());
		Fraction num1 = new Fraction();
		
		System.out.println("The sum of your fractions is: " + num2.add(num2,num1));
		System.out.println("The difference of your fractions is: " + num2.subtract(num2,num1));
		System.out.println("The product of your fractions is: " + num2.multiply(num2,num1));
		System.out.println("The product of your fractions is: " + num2.divide(num2,num1));
	}	
	}
