import javax.swing.*;
import java.text.*;
public class Labsheet201 {
   public static void main(String[] args) {
    final int BUFFET = 299;
    int isMember;
    
    
    DecimalFormat frm = new DecimalFormat("#,###.00");
    
    
    int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill");
   
    double totalPrice = BUFFET * numberofCustomer;
    
   

   //System.out.printf("Total price is %,.2f",totalPrice);
   
   
   
    double totalPrice = BUFFET * numberofCustomer;
    
   do {
	    isMember = JOptionPane.showConfirmDialog(null,"Total price is"+frm.format(totalPrice) + "Baht."+
			    "Do you have a Member card?");   
   }while(isMember==JOptionPane.CANCEL_OPTION);
    
    if(isMember==JOptionPane.YES_OPTION) {
    	double priceAfterDiscount = totalPrice * 0.90;
    	JOptionPane.showMessageDialog(null,"Amount to be paid is"+priceAfterDiscount+"Baht.");
    }else if(isMember==JOptionPane.NO_OPTION) {
    	JOptionPane.showConfirmDialog(null,"Amount to be paid is"+totalPrice+"Baht.");
    	
    }
   
   }
}

