import javax.swing.*;
public class JavaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Input Product Name: ");
		String strProductUnit = JOptionPane.showInputDialog("Input Product Unit: ");
		int productUnit = Integer.parseInt(strProductUnit);
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog(""+ "Input Price per Unit:"));
		
		double totalPriceofProduct = productUnit *productPrice;
		JOptionPane.showMessageDialog(null, "total Price is " + totalPriceofProduct + "Baht.");
		double totalwithVat = totalPriceofProduct + 1.07;
		String frmtotalPriceofProduct = String.format("$,.2f",totalwithVat);
		String frmtotalwithVat = String.format("$,.2f",totalwithVat);
		
		JOptionPane.showMessageDialog(null, "Total Price is" + totalPriceofProduct + "Baht."+"\nAdd VAT is "+totalwithVat + " Baht.");
		
		
		

	}

}
