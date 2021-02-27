public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Circle\nSquare");
System.out.println("Enter the Shape:");
String s=sc.next();
Circle c=new Circle();
Square h=new Square();
if(s.equalsIgnoreCase("circle"))
{
	System.out.println("Enter the radius");
	int r1=sc.nextInt();
	c.setValue(r1);
	c.getValue();
	double d=c.calculatearea(r1);
	System.out.println("Area of circle is:"+d);
}

else
{
	
		System.out.println("Enter the side");
		int r1=sc.nextInt();
		h.setValue(r1);
		h.getValue();
		double d=h.calculatearea(r1);
		System.out.println("Area of square is:"+d);
}
	}

}
