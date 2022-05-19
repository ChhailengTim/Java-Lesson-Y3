import java.awt.*;
import java.awt.event.*;
import  javax.swing.*;
class Lotery extends JFrame implements ActionListener
{
	RunNum n1=new RunNum();
	RunNum n2=new RunNum();
	RunNum n3=new RunNum();
	JButton bStart=new JButton("Start");
	JButton bStop=new JButton("Stop");

Lotery(){
	JPanel p=new JPanel();
	p.add(n1);p.add(n2);p.add(n3);
	this.add("North",p);
	p=new JPanel();
	p.add(bStart);
	p.add(bStop);
	this.add("South",p);
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
		new Thread(n2).start();
		new Thread(n3).start();
	}
	else
	{
		n1.stopRun();
		n2.stopRun();
		n3.stopRun();
	}
}

public static void main(String arg[])
	{
	new Lotery();
	}
}