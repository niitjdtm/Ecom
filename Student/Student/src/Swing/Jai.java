package Swing;

import java.util.Scanner;

 class Test1  {
	
	public void test() {
		Scanner h = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a =h.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the value of b");
		int b =sc1.nextInt();
		
		int c = a+b;
		System.out.println(c);
	}
	

}
public class Jai  {
	public static void main(String args[]) {
		
	Test1 obj = new Test1();
	obj.test();
	}
	
}
