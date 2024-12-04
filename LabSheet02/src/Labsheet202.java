import java.util.*;
public class Labsheet202 {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int previousNumber = Integer.MIN_VALUE;
        int currentNumber;
        
		while(true) {
			System.out.print("Input number: ");
			currentNumber = input.nextInt();
			
			if(currentNumber < previousNumber) {
				break;
			}
			previousNumber = currentNumber;
		}
		System.out.print("\nBYE BYE");
	}
 
}