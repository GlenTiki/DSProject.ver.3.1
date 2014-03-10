package ie.wit.exceptions;

public class InvalidPriceException extends ArithmeticException {

	public InvalidPriceException() 
	{
		// TODO Auto-generated constructor stub
		super("Sorry, No Dice man");
	}

	public InvalidPriceException(String message) 
	{
		super(message);
		// TODO Auto-generated constructor stub
	}

}
