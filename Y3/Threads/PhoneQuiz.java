import java.awt.*;
import java.awt.event.*;
import  javax.swing.*;
class PhoneQuiz extends JFrame implements ActionListener
{
	RunPhone n1=new RunPhone();
	JButton bStart=new JButton("Start");
	JButton bStop=new JButton("Stop");
	JTextArea txtInfo=new JTextArea();

PhoneQuiz(){
	JPanel p=new JPanel();
	p.add(n1);
	this.add("North",p);
	p=new JPanel();
	p.add(bStart);
	p.add(bStop);
	this.add("South",p);
	this.add(txtInfo);
	setTitle("Lotery");
	setSize(500,400);
	setLocation(100,100);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	bStart.addActionListener(this);
	bStop.addActionListener(this);
}

public void actionPerformed(ActionEvent e){
if(e.getSource()==bStart)
	{
		new Thread(n1).start();
		
	}
	else
	{
		n1.stopRun();
		txtInfo.append(n1.getCustomerInfo()+"\r\n");
	}
}

public static void main(String arg[])
	{
	new PhoneQuiz();
	}
}