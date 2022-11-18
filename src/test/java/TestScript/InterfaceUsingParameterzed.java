package TestScript;

import java.util.Scanner;
//Interface using Parametarized method

interface Details
{
	public void Accept(String name, int ID, String city);
}
class Emp implements Details
{
	public void Accept(String name, int ID, String city) {
		if (city.equals("pune")) {
			System.out.println("Hai "+name+" Welcome to "+city);
		}else if (city.equals("mumbai")) {
			System.out.println("Hai "+name+" Welcome to "+city);
		}else {
			System.out.println("You are not in right place "+city);
		}
	}
}
class Staff implements Details
{
	public void Accept(String name, int age, String city) {
		if (age <= 18) {
			System.out.println("Hey "+name+" You are not applicable for voting");
		}else {
			System.out.println("Hey "+name+" You are applicable for voting");
		}
	}
}

public class InterfaceUsingParameterzed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		System.out.println("Enter the city: ");
		String city = sc.nextLine();
		System.out.println("Enter the Id: ");
		int ID = sc.nextInt();
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		Details o1;
		o1 = new Emp();
		o1.Accept(name, ID, city);
		o1= new Staff();
		o1.Accept(name, age, city);
	}

}
