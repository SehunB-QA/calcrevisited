// Sehun Babatunde

package calcrevisited;

public class CalcRevisited {
	
	public int Addtion(int firstValue, int secondValue)
	{
		return firstValue + secondValue;
	}
	
	public int Subtraction (int firstValue, int secondValue)
	{
		return firstValue - secondValue;
	}
	
	public double Division (int firstValue, int secondValue)
	{
		
		if(secondValue > firstValue)
		{
			
		double result;
		return result = firstValue / secondValue;
		}
		
		else {
		
	 System.out.println("Sorry, the division cannot be performed: The first value is larger than second value.");
		
		return 0;
		}
	}

}
