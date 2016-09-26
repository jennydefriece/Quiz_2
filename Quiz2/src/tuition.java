import java.util.Scanner;

public class tuition {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type initial tution cost:");
		double initial_tuition = input.nextDouble();

		System.out.print("Type percentage increase per year:");
		double percentage = input.nextDouble();
		
		
		
		double total=0;
		
		for (int i=0; i <= 3; i++) {
			double yearly_tuition=initial_tuition*percentage;  
			double cost=total+=yearly_tuition;
	
		
System.out.println("The total cost of tuition for this year will be:"+ cost);		
			
		}
	}
}

			
			
	
					
					
		