package examples;


/**
 * Source: Java Foundations (Lewis et al.) This class represents one rational
 * number with a numerator and denominator.
 * 
 * @author Kjohnson & Jamal
 */
public class RationalNumber 
{
	private int numerator, denominator;

	/**
	 * Constructor: Sets up the rational number by ensuring a nonzero
	 * denominator and making only the numerator signed.
	 * 
	 * @param numer
	 *            : formal parameter for numerator
	 * @param denom
	 *            : formal parameter for denominator
	 */
	public RationalNumber(int numer, int denom) 
	{
		if (denom == 0) 
		{
			denom = 1;
		}

		// Make the numerator "store" the sign
		if (denom < 0) 
		{
			numer = numer * -1;
			denom = denom * -1;
		}

		numerator = numer;
		denominator = denom;

		reduce();
	}

	/**
	 * Returns the numerator of this rational number.
	 * 
	 * @return value of numerator
	 */
	public int getNumerator() 
	{
		return numerator;
	}

	/**
	 * Returns the denominator of this rational number.
	 * 
	 * @return value of denominator
	 */
	public int getDenominator() 
	{
		return denominator;
	}

	/**
	 * Returns the reciprocal of this rational number.
	 */
	public RationalNumber reciprocal() 
	{
		return new RationalNumber(denominator, numerator);
	}

	/**
	 * Adds this rational number to the one passed as a parameter. A common
	 * denominator is found by multiplying the individual denominators.
	 * 
	 * @param op2
	 *            : a RationalNumber object
	 * @return new RationalNumber object with common denominator
	 */
	public RationalNumber add(RationalNumber op2) 
	{
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator;
		int sum = numerator1 + numerator2;

		return new RationalNumber(sum, commonDenominator);
	}

	/**
	 * Subtracts the rational number passed as a parameter from this rational
	 * number.
	 * 
	 * @param op2:
	 *            a RationalNumber object
	 * @return new RationalNumber object after subtraction
	 */
	public RationalNumber subtract(RationalNumber op2) 
	{
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator;
		int difference = numerator1 - numerator2;

		return new RationalNumber(difference, commonDenominator);
	}

	/**
	 * Multiplies this rational number by the one passed as a parameter.
	 * 
	 * @param op2:
	 *            a RationalNumber object
	 * @return new RationalNumber object after multiplication
	 */
	public RationalNumber multiply(RationalNumber op2) 
	{
		int numer = numerator * op2.getNumerator();
		int denom = denominator * op2.getDenominator();

		return new RationalNumber(numer, denom);
	}

	/**
	 * Divides this rational number by the one passed as a parameter by
	 * multiplying by the reciprocal of the second rational.
	 * 
	 * @param op2:
	 *            a RationalNumber object
	 * @return new RationalNumber object after division
	 */
	public RationalNumber divide(RationalNumber op2) 
	{
		return multiply(op2.reciprocal());
	}

	/**
	 * Determines if this rational number is equal to the one passed as a
	 * parameter. Assumes they are both reduced.
	 * 
	 * @param op2:
	 *            a RationalNumber object
	 * @return a boolean value for checking if two objects are equal or not
	 */
	public boolean isLike(RationalNumber op2) 
	{
		return (numerator == op2.getNumerator() && denominator == op2.getDenominator());
	}

	/**
	 * Returns this rational number as a string.
	 */
	public String toString() 
	{
		String result;

		if (numerator == 0) 
		{
			result = "0";
		} else 
			if (denominator == 1) 
			{
				result = numerator + "";
			} 
			else 
			{
				result = numerator + "/" + denominator;
			}

		return result;
	}

	/**
	 * Reduces this rational number by dividing both the numerator and the
	 * denominator by their greatest common divisor.
	 */
	private void reduce() 
	{
		if (numerator != 0) 
		{
			int common = gcd(Math.abs(numerator), denominator);

			numerator = numerator / common;
			denominator = denominator / common;
		}
	}

	/**
	 * Computes and returns the greatest common divisor of the two positive
	 * parameters. Uses Euclid's algorithm.
	 * 
	 * @param num1
	 *            : an integer number
	 * @param num2
	 *            : an integer number
	 * @return an integer number as the greatest common divisor
	 */
	private int gcd(int num1, int num2) 
	{
		while (num1 != num2)
			if (num1 > num2){
				num1 = num1 - num2;
			}
			else
			{
				num2 = num2 - num1;
			}

		return num1;
	}
}
