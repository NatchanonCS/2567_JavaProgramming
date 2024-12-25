import javax.swing.JOptionPane;
public class Lab507 {
	public static void main(String[] args) {
		
		int[] number = new int[5];
		for (int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+":"));
		}
	
		showEven(number);
		showOdd(number);
	}
	public static void showEven(int[] nums) {
		
		String number = "";
		
		for (int numberEven : nums) {
			if (numberEven%2 == 0) {
				number += numberEven+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number: \n"+number);
	}
	public static void showOdd(int[] nums) {
		
		String number = "";
		
		for (int numberOdd : nums) {
			if (numberOdd%2 != 0) {
				 number += numberOdd+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of odd number: \n"+number);
	}
}



