
public class Calculator {

	public int add(int intadd1, int intadd2) 
	{
		return intadd1+ intadd2;
	}
	
	public static int Subtract(int int1, int int2) 
	{
		return int1- int2;
	}
	public static int Multiply(int int1, int int2) 
	{
		return int1*int2;
	}
	public static double Divide(double int1, double int2) 
	{
		if(int1 ==0||int2 ==0) 
	
		{
			return 0;
					
		}
		return int1/int2;
	}
}
