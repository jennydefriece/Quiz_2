import java.util.Scanner;

public class tuition {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter initial tuition cost: ");
		double initial=input.nextDouble();
		
		System.out.print("Enter rate of increase of tuition: ");
		double rate=input.nextDouble();

     for (int i=0; i<4; i++) {
    	 double total= initial+=initial*rate;
    	
    			 
    	 System.out.println("Tuition for the year is:" + total);
     }
	}
     }
	
		 

	 
