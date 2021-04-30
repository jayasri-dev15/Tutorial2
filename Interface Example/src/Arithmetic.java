
public interface Arithmetic 
{
int a=20;
int b=10;
int addition();
int subtraction();
}


class operation implements Arithmetic
{

	@Override
	public int addition()
	{
		int sum=a+b;
		return sum;
	}

	@Override
	public int subtraction()
	{
		int difference=a-b;
		return  difference;
	}
	
}