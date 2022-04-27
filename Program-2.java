import java.util.*;
public class OddNum {
    public static void main(String[] args) {
			
    	Scanner scan  = new Scanner(System.in);
    	System.out.println("Enter input");
    	int a=scan.nextInt();
    	int j=1;
    	System.out.print("input a = "+a+", then output : ");
    	for(int i=1;i<=a;i++){
    		if(i<=a-1)
    	                           System.out.print(j+",");
    		else 
                                            System.out.print(j);
    		j=j+2;
    	}
	}
}
