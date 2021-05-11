import java.util.Scanner;
import java.util.*;
public class Calculator {
 public static void main (String args[]) {
	 
	 class Values{
		 double x;
		 double y;
		 double z;
		 char operator;
		 char operator2;
		 double answer;
		 
	 }
	 
	 Values Calculation = new Values();
	 Scanner Scan = new Scanner(System.in);

		boolean work = true;
		do {	
		
		 
		 
		 System.out.println("Enter number:");
		 Calculation.x = Scan.nextDouble();
		 
 System.out.println("Enter operator (+,-,*,/)");
 Calculation.operator = Scan.next().charAt(0);
 
		System.out.println("Enter number:");
		 Calculation.y = Scan.nextDouble();
		 
		 
		 
		 
		 
		 switch (Calculation.operator) {
		 
		 case '+': Calculation.z = Calculation.x + Calculation.y;
		 break;
		 case '*': Calculation.z = Calculation.x * Calculation.y;
		 break;
		 case '-': Calculation.z = Calculation.x - Calculation.y;
		 break;
		 case '/': Calculation.z = Calculation.x / Calculation.y;
		 break;
	}
	
	
	System.out.println(Calculation.x+" " +Calculation.operator+" "+Calculation.y+" = "+Calculation.z );
	
	
		}
		
		while (work == true);
 }
}