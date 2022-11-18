package TestScript;

interface car{
	public void door();
}
class BMW implements car{
	public void door() {
		int a;
		System.out.println("the Door of BMW car");
	}
}
class XYZ implements car{
	public void door() {
		int a=5,b=4,c;
		c=a+b;
		System.out.println("The XYZ car Door = "+c);
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car o1;
		o1 = new BMW();
		o1.door();
		o1= new XYZ();
		o1.door();
	}

}
