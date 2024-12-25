import javax.swing.*;
public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayCardAndTotal("Apple",10.5,"Banana",5.75,"Orange",7.3);
		displayCardAndTotal("Mile",20.0,"Bread",15.0);
		displayCardAndTotal();
	}
	public static void displayCardAndTotal(Object... items) {
		if(items.length == 0) {
			System.out.println("No Items in the card.");
			return;
		}
		System.out.println("Items in the card : ");
		for(int i=0;i<items.length;i+=2) {
			String itemName = (String)items[i];
			double itemPrice = (double)items[i+1];
			
			JOptionPane.showMessageDialog(null,
					"- "+itemName +
					": $"+itemPrice);
			System.out.printf("- %s: $%.2f%n",itemName,itemPrice);
			
		}
		System.out.println();
		
	}

}
