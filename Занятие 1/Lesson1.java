package core;

public class Lesson1 {
	
   public static void main (String[] args) {
		
		
		int a = 10;
		short b = 1100;
		long c = 4568712546l;
		double d = 10.25;
		float e = 5.15f;
		char k = 15;
		boolean m = true;
		
		int result1 = a+b;
		double result2 = c-d;
		double result3 = e*d;
		
		System.out.println(result1 + "   " + result2 + "   " + result3);
		
		if(c > d) {
			System.out.println ("c more than d");
		} else {
			System.out.println ("c not more than d");
		}
	
		if(e < a) {
			System.out.println ("e not more than a");
		} else {
			System.out.println ("e more than a");
		}
		
		
		if(a == b) {
			System.out.print ("a ravno b");
		} else {
			System.out.print ("a ne ravno b");
		}
	
		
	
	}}


