package hello;
import javax.swing.JOptionPane;
public class HelloNameDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String result;
result = JOptionPane.showInputDialog("Please enter your name:");
JOptionPane.showMessageDialog(null,"hi"+ result +"!");
System.exit(0);
	}

}
