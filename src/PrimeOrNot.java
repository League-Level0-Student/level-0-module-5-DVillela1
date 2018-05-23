import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	
String dontuse = JOptionPane.showInputDialog("Input a number. I will determine if your number is prime or not.");
	
int pn = Integer.parseInt(dontuse);

if (pn < 2) {
	JOptionPane.showMessageDialog(null, "Your number is neither prime or composite.");
	System.exit(0);
}

for (int i = 2; i < pn-1; i++) {

if ((pn % i) == 0) {
	JOptionPane.showMessageDialog(null, "Your number is composite.");
	System.exit(0);
}
else if ((pn % i) == 2){
	JOptionPane.showMessageDialog(null, "Your number is prime.");
	System.exit(0);
}
	
}
	
	
	
	
	
	
}	
}
