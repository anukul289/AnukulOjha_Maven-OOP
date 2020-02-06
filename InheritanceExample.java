import java.util.Scanner;
class Circle
{
	public double r;
	Circle(double radius)
	{
		r=radius;
	}
	double getRadius()
	{
		return r;
	}
	void setRadius(double radius)
	{
		r=radius;
	}
	double getCircleArea()
	{
		return (3.14159*r*r);
	}
}
class Cylinder extends Circle
{
	public double h;
	Cylinder(double height,double radius)
	{
		super(radius);
		h=height;
	}
	double getHeight()
	{
		return h;
	}
	void setHeight(double height)
	{
		h=height;
	}double getCylinderArea()
	{
		double radius=getRadius();
		double height=getHeight();
		double x=2*3.14159*radius*(radius+height);
		return x;
	}
	double getCylinderVolume()
	{
		double radius=getRadius();
		double height=getHeight();
		double x=3.14159*radius*radius*height;
		return x;
	}
}
public class Assignment_11
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double radius,height;
		System.out.println("Enter the radius and height : ");
		radius=sc.nextDouble();
		height=sc.nextDouble();
		Cylinder obj=new Cylinder(height,radius);
		System.out.println("Area : "+obj.getCylinderArea());
		System.out.println("Volume : "+obj.getCylinderVolume());
	}
}