import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
class NewWord extends JInternalFrame
{
	JButton bSave=new JButton("Save");
	JButton bClose=new JButton("Close");
	JTextField txtWord=new JTextField();
	JTextField txtTran=new JTextField();
	NewWord(){
			JPanel p=new JPanel(new GridLayout(2,2,50,40));
			p.add(new JLabel("New word "));p.add(txtWord);
			p.add(new JLabel("Translate "));p.add(txtTran);
			add(p);
			p=new JPanel();
			p.add(bSave);
			p.add(bClose);
			this.add("South",p);
			setTitle("New Word");
			setSize(500,400);
			
		}
}