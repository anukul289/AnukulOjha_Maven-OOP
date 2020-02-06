interface Shape
{
	double area(double c);
}
class circle implements Shape
{
	public double area(double r)
	{
		return 3.14159*r*r;
	}
}
class triangle implements Shape
{
	public double area(double s)
	{
		return (1.732/4)*s*s;
	}	
}
class rectangle implements Shape
{
	public double area(double l)
	{
		return l*l;
	}	
}
class Assignment_15
{
	public static void main(String args[])
	{
		Shape s;
		double sum=0;
		s=new circle();
		sum+=s.area(10);
		s=new triangle();
		sum+=s.area(10);
		s=new rectangle();
		sum+=s.area(10);
		System.out.println("Total occupied space = "+sum);
	}
}
