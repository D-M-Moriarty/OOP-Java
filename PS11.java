import javax.swing.*;

public class PS11 {
	public static void main(String args[]){
		
		double pounds = -1, euro;
		String poundsString;
		
		while(pounds != 0){
			
			poundsString = JOptionPane.showInputDialog("Please enter an amount in GB Pounds to convert to Euro: ");
			
			pounds = Double.parseDouble(poundsString);
			
			euro = pounds*1.17657;
			
			JOptionPane.showMessageDialog(null,pounds + " Pounds is equal to " + String.format("%.2f",euro) + " Euro","Currency Converter",
			JOptionPane.INFORMATION_MESSAGE);
		}
		
		System.exit(0);
	}
}