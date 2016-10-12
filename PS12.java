import javax.swing.*;
import java.awt.Font;

public class PS12 {
	public static void main(String args[]){
		
		
		JTextArea textArea = new JTextArea();
		Font textAreaFont = new Font("monospaced", Font.PLAIN,12);
		textArea.setFont(textAreaFont);
		
		textArea.setText(String.format("%-10s%-10s\n%-10s%-10s\n","Yards","Inches","------","------"));
		
		
		for(int i = 1; i <= 10; i++){
			textArea.append(String.format("%-10d%-10d\n",i,(i*36)));
		}

		JOptionPane.showMessageDialog(null,textArea,"Currency Converter",
			JOptionPane.INFORMATION_MESSAGE);
	}
}