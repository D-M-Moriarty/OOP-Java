/*calculate the cost of carpeting a room wall to wall. 
 *The user should be asked for his/her name, the length of 
 *the room, breadth of the room and cost per square metre of 
 *the carpet, each to be entered via an input dialog.
 **/
 
import javax.swing.*;
import java.awt.Font;

public class PS13 {
	public static void main(String[] args){
		
		double lenOfRoom, breadth, totalArea, costPSM, totalCost;
		String lenOfRoomS, breadthS, costPSMS, name;
		
		name = JOptionPane.showInputDialog("Please enter oyour name: ");
		
		lenOfRoomS = JOptionPane.showInputDialog("Please enter the length of the room: ");
		lenOfRoom = Double.parseDouble(lenOfRoomS);
		
		breadthS = JOptionPane.showInputDialog("Please enter the breadth of the room: ");
		breadth = Double.parseDouble(breadthS);
		
		costPSMS = JOptionPane.showInputDialog("Please enter the cost per square meter of the carpet: ");
		costPSM = Double.parseDouble(costPSMS);
		
		JTextArea textArea = new JTextArea(10,40);
		
		Font textAreaFont = new Font("monospaced", Font.PLAIN,12);
		textArea.setFont(textAreaFont);
		
		
		totalArea = breadth*lenOfRoom;
		
		totalCost = totalArea*costPSM;
		
		textArea.setText(String.format("%s%s\n%-30s%.2f m.\n%-30s%.2f m.\n%-30s%.2f m.\n%-30s%.2f m.\n%-30s%.2f m","Quotation for ",name,"Length of room:",+
			lenOfRoom,"Breadth of room",breadth,"Total area of the room:",+
			totalArea,"Cost per square meter:",costPSM,"Total cost of carpet",totalCost));
			
			
		JOptionPane.showMessageDialog(null,textArea,"Carpet",JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		
		
	}
}