package TestScript;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Pratice1 {

	public void Table() {
		int a = 5;
		for(int i=1; i<=12; i++) {
			int b = a * i;
			System.out.println(a+" * "+i+" = "+b );
		}
	}
	public void Div(int a, int b) {
		Scanner sc = new Scanner(System.in);
		try {
			
			int c = a/b;
			System.out.println("Division of number is "+c);
		}catch(Exception ex) {
			System.out.println("Enter value more than 0 in b value");
		}
	}
	public void EvenNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number to print even numbers: ");
		int a = sc.nextInt();
		System.out.println("Enter ending number to print even numbers: ");
		int b = sc.nextInt();
		for(int i=a;i<=b;i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	public void SumEvenNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number: ");
		int a = sc.nextInt();
		System.out.println("Enter ending number: ");
		int b = sc.nextInt();
		int Total = 0;
		for(int i=a;i<=b;i++) {
			if (i % 2 == 0) {
				Total = Total + i;
			}
		}
		System.out.println("Sum of all Even numbers: "+Total);
	}
	public void Percentage() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of Subject1: ");
		int x = sc.nextInt();
		System.out.println("Enter the marks of Subject2: ");
		int y = sc.nextInt();
		System.out.println("Enter the marks of Subject3: ");
		int z = sc.nextInt();
		System.out.println("Enter the marks of Subject4: ");
		int u = sc.nextInt();
		System.out.println("Enter the marks of Subject5: ");
		int v = sc.nextInt();
		int a = x+y+z+u+v;
		float percentage = (a/500)*100; 
		System.out.println(percentage);
		if(percentage>=0 && percentage<=45) {
			System.out.println("You failed");
		}else if(percentage>=46 && percentage<=75) {
			System.out.println("You are passed");
		}else if (percentage>=76 && percentage<=89) {
			System.out.println("First class");
		}else if(percentage>=90 && percentage<=100) {
			System.out.println("Distinction");
		}else {
			System.out.println("Enter a valid marks");
		}
	}
	public void Hash_map() {
		HashMap<String, String> map = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of keys: ");
		int n = sc.nextInt();
		for(int i =0;i<n;i++) {
			System.out.println("Enter the key: ");
			String k = sc.next();
			System.out.println("Enter the value: ");
			String v = sc.next();
			map.put(k, v);
		}
		System.out.println("HashMap: "+map);	// print HashMap
	// update HashMap
		System.out.println("Enter a key to update value: ");
		String a = sc.next();
		System.out.println("Enter a new value: ");
		String b = sc.next();
		map.put(a, b);
		System.out.println(map);
	// remove key
		System.out.println("Enter a key to remove: ");
		String rm = sc.next();
		map.remove(rm);
		System.out.println(map);
	}
	public void Array_list() {
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of names: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name: ");
			String name = sc.next();
			list.add(name);
		}
		System.out.println(list);
		System.out.println(list.size());
	// reverse the list 
		 System.out.println("List after reversing: ");
		 Collections.reverse(list);
		 System.out.println(list);
	}
//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Pratice1 obj = new Pratice1();
			Scanner sc = new Scanner(System.in);
			boolean choice = false;
			while(choice==false){
				System.out.println(" 1.Print 5 table\n 2.Division of two numbers\n 3.Print Even number from starting and ending values\n 4.Print sum of even numbers for staring to ending\n 5.Calculate the percentage of 5 subjects\n 6.Hashmap\n 7.ArrayLisy\n 8.Exit ");
				System.out.println("Enter your choice: ");
				int ch = sc.nextInt();
				switch(ch) {
					case 1 :
						System.out.println("You choose to print 5 table");
						obj.Table();
						break;
					case 2 :
						System.out.println("You choose Division of two numbers ");
						System.out.println("Enter a value1");
						int a = sc.nextInt();
						System.out.println("Enter a value2");
						int b = sc.nextInt();
						obj.Div(a, b);
						break;
					case 3 :
						System.out.println("You choose to Print Even number from starting to ending values");
						obj.EvenNum();
						break;
					case 4 :
						System.out.println("You choose to print sum of even numbers");
						obj.SumEvenNum();
						break;
					case 5 :
						System.out.println("You choose to Calculate the percentage of 5 subjects");
						obj.Percentage();
						break;
					case 6 :
						obj.Hash_map();
						break;
					case 7 :
						obj.Array_list();
						break;
					case 8 :
						System.out.println("You selected exit");
						System.exit(0);
						break;
					default:
						System.out.println("You choose wrong option");       	
				}
			}
		}catch(Exception ex) {
			System.out.println("Enter a valid input");
		}
	}

}
