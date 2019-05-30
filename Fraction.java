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
		this(0,0);
	}
	public Fraction(int n) {
		this(n,0);
	}
	public Fraction(int n, int d) {
		if(d==0) {
			System.out.println("Denominator cannot be zero");
			System.exit(1);
		}
		setDenominator(d);
		setNumerator(n);
	}

	//setter methods
	public void setDenominator(int d) {
		this.denominator = d;
	}
	public void setNumerator(int n) {
		this.numerator = n;
	}
	//getter methods
	public int getNumerator() {
		return this.numerator;
	}
	public int getDenominator() {
		return this.denominator;
	}
	//methods
	public Fraction add(Fraction fr1, Fraction fr2) {
		int numerator, denominator;
		numerator = fr2.numerator * fr1.denominator + fr1.numerator*fr2.denominator;
		denominator = fr2.denominator*fr1.denominator;
	  return simplified(numerator, denominator);
	}
	// method to subtract to fractions
	public Fraction subtract(Fraction fr1, Fraction fr2) {
		int numerator, denominator;
		numerator = fr2.numerator * fr1.denominator - fr1.numerator*fr2.denominator;
		denominator = fr2.denominator*fr1.denominator;
		return simplified(numerator, denominator);
	}
	//method to multiply two fractions
	public Fraction multiply(Fraction fr1, Fraction fr2) {
		int numerator, denominator;
		numerator = fr2.numerator * fr1.numerator;
		denominator = fr2.denominator*fr1.denominator;
		return simplified(numerator, denominator);
	}
	// method to divide two fractions
	public Fraction divide(Fraction fr1, Fraction fr2) {
		int numerator, denominator;
		numerator = fr2.numerator * fr1.denominator;
		denominator = fr2.denominator*fr1.numerator;
		return simplified(numerator, denominator);
	}
	// method to return a simplified form of a fraction given numerator and denominator
	public Fraction simplified(int n, int d) {
		for (int i=2; i<=Math.abs(n); i++) {
			if ( n%i == 0 && d%i == 0) {
				d = d/i;
				n = n/i;
				i = 1;
			}
		}
		Fraction result = new Fraction(n,d);
		return result;
	}


	//string representation of Fraction class
  public String toString(){
		if(this.getNumerator() == 0){
			return "0";
		}else if(this.getNumerator() > this.getDenominator()){
			String a = Integer.toString(this.getNumerator()%this.getDenominator());
			String b = Integer.toString(this.getNumerator()/this.getDenominator());
			String c = Integer.toString(this.getDenominator());
			return b + " and " + a + "/" + c;
		}
		return Integer.toString(this.getNumerator()) + "/" + Integer.toString(this.getDenominator());
	}

	// main method
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Fraction num2;
		//System.out.println("Enter numerator, denominator of your fraction");
		num2 = new Fraction(6,8);
		Fraction num1 = new Fraction(6,14);
		System.out.println("The sum of your fractions is: " + num2.add(num2,num1));
		System.out.println("The difference of your fractions is: " + num2.subtract(num2,num1));
		System.out.println("The product of your fractions is: " + num2.multiply(num2,num1));
		System.out.println("The quotient of your fractions is: " + num2.divide(num2,num1));
	}
	}
