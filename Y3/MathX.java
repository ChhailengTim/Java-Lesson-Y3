public class MathX
{
 public static double roundX(double x,int d)
	{
		double xx=x * Math.pow(10,d);
		xx=Math.round(xx);
		return xx/Math.pow(10,d);
	}
public static double round100(double x)
	{
		double xx=x / 100;
		xx=Math.round(xx);
		return xx*100;
	}



}