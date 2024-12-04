import java.util.*;
public class Labsheet209 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double BASE_SALARY = 1000.00;
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1;
		
		
		int sales;
		double salary;
		
		while(true) {
			System.out.print("Enter gross sales for the salespersonfor -1 to end : ");
			sales = input.nextInt();
			
		if(sales==SENTINEL) {
			break;
		}
		
		salary = BASE_SALARY + (sales * COMMISSION_RATE);
		
		System.out.printf("The slaesperson's salary is : $%,.2f\n",salary);
		
		System.out.println("bye");
		
		input.close();

	}

}
}