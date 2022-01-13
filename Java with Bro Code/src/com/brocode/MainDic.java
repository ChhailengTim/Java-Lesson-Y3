import java.awt.*;
import java.awt.event.*;
class MainDic extends Frame implements ActionListener
{
List lstWord=new List();
TextArea txtTrans=new TextArea();
TextField txtFind=new TextField(25);
Button bFind=new Button("Go");
Button bClose=new Button("Close");
MainDic()
	{
		// Design Form
		Panel p=new Panel();// default is flow layout
		p.add(new Label("Word : "));
		p.add(txtFind);
		p.add(bFind);
		p.add(bClose);
		this.add("North",p);
		p=new Panel();
		p.setLayout(new GridLayout(1,2,50,0));
		p.add(lstWord);
		p.add(txtTrans);
		this.add("Center",p);
	// Add Data To List
		lstWord.addItem("Apple");
		lstWord.addItem("Baby");
		lstWord.addItem("Boy");
		lstWord.addItem("Zoo");
	// add Close Event (X)
	addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent e){System.exit(0);}});
	 // Add Event to Button
	bFind.addActionListener(this);
	bClose.addActionListener(this);

	// Set value to Frame for displaying
		setSize(600,600);
		setTitle("JDictionary");
		setVisible(true);
	}
public void actionPerformed(ActionEvent ev){
if (ev.getSource()==bClose)
		System.exit(0);
if(ev.getSource()==bFind)
	txtTrans.setText("YOU CLICK FIND BUTTON");

}

public static void main(String arg[])
	{
		new MainDic();
	}

}