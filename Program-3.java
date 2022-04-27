import java.util.*;
public class OddNumforOdd {
    public static void main(String[] args) {
			
    	Scanner scan  = new Scanner(System.in);
    	System.out.println("Enter input");
    	int a=scan.nextInt();
    	int j=1;
    	System.out.print("input a = "+a+", then output : ");
    	for(int i=1;i<=(a%2==0?a-1:a);i++){
    		if(i<=(a%2==0?a-2:a-1))
    	        System.out.print(j+",");
    		else 
    			System.out.print(j);
    		j=j+2;
    	}
	}
}
