import javax.swing.JOptionPane;
import java.text.*;
public class Labsheet203 {
 
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###,###.0");
		
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight:"));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input Height"));
		
        double heightM = height / 100.0;
 
		double bmiCalculation = weight / (heightM*heightM);
		
		if (bmiCalculation < 18.5) {
			JOptionPane.showMessageDialog(null, "BMI = "+ frm.format(bmiCalculation)+"\nYou're Overweight","BMI" ,JOptionPane.WARNING_MESSAGE);
		}
		else if(bmiCalculation >= 18.5 && bmiCalculation <=24.9) {
			JOptionPane.showMessageDialog(null, "BMI = "+ frm.format(bmiCalculation)+"\nYou're Normal-Weight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		else if(bmiCalculation >= 25.0 && bmiCalculation <=29.9) {
			JOptionPane.showMessageDialog(null, "BMI = "+ frm.format(bmiCalculation)+"\nYou're Overweight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "BMI = "+ frm.format(bmiCalculation)+"\nYou're Obesity","BMI",JOptionPane.WARNING_MESSAGE);
		}
	}
 
}

