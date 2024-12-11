import javax.swing.JOptionPane;
public class Lab302_1 {

	public static void main(String[] args) {
		
		boolean chkEmail = false;
		
		String inputEmail;
		
		while(true) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail").toLowerCase();
			while(inputEmail.startsWith("@") || inputEmail.contains(" ")); {
				inputEmail = JOptionPane.showInputDialog("Input youe e-mail,again:");
			}
			chkEmail = inputEmail.endsWith("@gmail.com") || inputEmail.endsWith("hotmail.com");
			if(chkEmail) {
				JOptionPane.showInternalMessageDialog(null, "Your e-mail is");
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
				continue;
			}
		}
		
		
		

	}
}
