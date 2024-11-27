import java.util.*;
import java.text.*;
public class Labsheet01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		System.out.print("Input product nane: ");
		String productName = input.nextLine();
		System.out.print("Input product unit: ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit: ");
		float productPrice = input.nextFloat();
		System.out.println();
		System.out.print("---------------------------------------------------------------------------------------------------------");
		float TotalPriceofProduct = productUnit * productPrice;
		System.out.println("\nTotal price is " +TotalPriceofProduct +" bath.");
		System.out.print("---------------------------------------------------------------------------------------------------------");
		System.out.print("\nHow many discount (%) :");
		int Discount = input.nextInt();
		float DiscountAmount = TotalPriceofProduct - (TotalPriceofProduct*Discount/100);
		float TotalPricewithDiscount = TotalPriceofProduct - DiscountAmount;
		System.out.println("Discount from " +Discount + "%\t"+frm.format(TotalPricewithDiscount)+" bath.");
		System.out.println("Amount to be paid\t"+frm.format(DiscountAmount) +" bath.");
		
	}
}