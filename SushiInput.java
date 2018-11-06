// Name:
// Date:
// Per:
// AP Computer Science

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SushiInput extends JPanel implements ActionListener {
	private SushiList msgList;
	
	public SushiInput(SushiList msgList) {
		this.msgList = msgList;
		JTextField input = new JTextField(40);
		input.setBackground(Color.PINK);
		input.addActionListener(this);
		add(input);
	}
	
	

	// Handles input events: called when user presses <Enter>
	public void actionPerformed(ActionEvent e) {
		JTextField input = (JTextField) e.getSource();
		String msg = input.getText().trim();
			msgList.getCount(msg);
			msgList.getPrice(msg);
			msgList.getLoc(msg);
		
			//System.out.print(msgList.getCount(msg));
//		else
//			msgList.insert(msg);
		input.setText("");
	}
}
