package Shape;

public class triangle{
	public
	int a,b,sum=0;
	public void getdata(int x)
	{
		a=x;
	}
	public void getdata1(int x,int y)
	{
		a=x;
		b=y;
	}
	public int calculate()
	{
		sum=(a*b)/2;
		return sum;
	}
}
