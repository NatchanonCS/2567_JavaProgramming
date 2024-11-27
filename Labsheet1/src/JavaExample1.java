import java.util.*;
import java.text.*;

public class JavaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		System.out.print("Input product name: ");
		String productName = input.nextLine();
		System.out.print("Input product unit: ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit: ");
		float productPrice = input.nextFloat();
		System.out.println();
		Float totalPriceofProduct = productUnit * productPrice;
		System.out.println("Total Price is "+frm.format(productPrice)
				+" baht. ");
		//Float totalwithVat = totalPriceofProduct + (totalPriceofProduct*7/100);
		Float totalwithVat = totalPriceofProduct * 1.07f;
		System.out.println("Add VAT 7% is "+ totalwithVat + " baht. ");
		
		System.out.println();
		String frmtotalwithVat = String.format("$,.2f",totalwithVat);
		System.out.println("Output using String.format");
		System.out.println("Add VAT 7% is "+ frmtotalwithVat + "baht.");
		System.out.println("Output using printf");
		System.out.println("Add VAT 7% is %,.2f, totalwithVat");
		
		
		
		input.close();

	}

}
