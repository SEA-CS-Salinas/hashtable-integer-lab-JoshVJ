//Name - Joshua Vento-Jones

public class Number
{
	private int theValue; // Holds int value of the value assigned to this object.
	
	// @param int value: number to set instance variable theValue to
	public Number(int value)
	{
		theValue = value;
	}	
	
	// @return int value, returns theValue instance variable unmodified
	public int getValue()
	{
		return theValue;
	}
	
	// @param Object obj, data to test whether or not it is equal to this Number. **MUST BE ABLE TO BE CAST TO INT**
	// @return boolean on whether the object parameter is equivalent to this value
	public boolean equals(Object obj)
	{
		if((int)obj == theValue)
			return true;
		return false;
	} 
	
	// @return int value of theValue instance variable % 10, definition of the hashCode (remainder from dividing by 10, essentially the final digit)
	public int hashCode()
	{
		return (theValue % 10);
	}

	// @return String containing theValue instance variable unmodified
	public String toString()
	{
		return "" + theValue;
	}	
}
