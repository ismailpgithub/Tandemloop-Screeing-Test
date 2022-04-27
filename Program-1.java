import java.util.*;

public class SwitchCase {
    public static void main(String[] args) {
		double a=0;
		double b=0;
		String operation;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter value of a");
	    a=scan.nextDouble();
	    System.out.println("Enter value of b");
	    b=scan.nextDouble();
	    System.out.println("Enter type of operation");
	    scan.nextLine();
	    operation = scan.nextLine();
	    switch(operation){
	    case "+":
	    	System.out.println("Result is "+(a+b));
	    	break;
	    case "-":
	    	System.out.println("Result is "+(a-b));
	    	break;	
	    case "*":
	    	System.out.println("Result is "+(a*b));
	    	break;	
	    case "/":
	    	System.out.println("Result is "+(a/b));
	    	break;	
	    default:
	    	System.out.println("Invalid input");
	    }
	}
   
}