package TestScript;
// Interface using Non-Parametarized method
interface Shape
{
	public void Area();
}
class Rectangle implements Shape
{
	public void Area() {
		int l=12;
        int b=15;
        int area=l*b;
        System.out.println("Area of rectangle: "+area);
	}
}
class Circle implements Shape
{
	public void Area() {
		int r=3;
        double area=3.14*r*r;
        System.out.println("Radius of the circle: "+area);
	}
}
public class InterfaceArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape o1;
		o1 = new Rectangle();
		o1.Area();
		o1= new Circle();
		o1.Area();
	}

}
