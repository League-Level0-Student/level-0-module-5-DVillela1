import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	
String dontuse = JOptionPane.showInputDialog("Input a number. I will determine if your number is prime or not.");
	
int pn = Integer.parseInt(dontuse);

for (int i = 2; i < pn-1; i++) {
	
if ((pn % i) == 0) {
	JOptionPane.showMessageDialog(null, "Your number is not prime.");
	System.exit(0);
}

	
}
	
	
	
	
	
	
}	
}
