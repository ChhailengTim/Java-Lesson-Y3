import java.awt.*;
import java.awt.event.*;
class MainDic extends Frame implements ActionListener,TextListener
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
	lstWord.addItem("An");
		lstWord.addItem("And");
lstWord.addItem("Apple");
		
		lstWord.addItem("Baby");
		lstWord.addItem("Boy");
		lstWord.addItem("Bug");
		lstWord.addItem("Cat");
		lstWord.addItem("Cow");
		lstWord.addItem("Cry");
		lstWord.addItem("Zoo");
		lstWord.addItem("Zoom");	
// add Close Event (X)
	addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent e){System.exit(0);}});
	 // Add Event to Button
	bFind.addActionListener(this); // make add ear for txtFind
	txtFind.addTextListener(this);
	bClose.addActionListener(this);
	lstWord.addItemListener(new ItemListener(){public void itemStateChanged(ItemEvent e){
	lstWord.addMouseListener(new MouseAdapter(){public void mouseClicked(MouseEvent e){lstClick(e);}});
	callSelect();}});
	// Set value to Frame for displaying
		setSize(600,600);
		setTitle("JDictionary");
		setVisible(true);
	}
public void lstClick(MouseEvent ev)
	{
		if(ev.getClickCount()==2) // event double click
		{
			lstWord.remove(lstWord.getSelectedItem());
		}
	}
void callSelect(){
String selectdata=lstWord.getSelectedItem().toString();
txtTrans.setText(selectdata);
//.....
}
public void actionPerformed(ActionEvent ev){
if (ev.getSource()==bClose)
		System.exit(0);
if(ev.getSource()==bFind)
	txtTrans.setText("YOU CLICK FIND BUTTON");

}
public void textValueChanged(TextEvent e)
{
	lstWord.select(getIndex(txtFind.getText()));
}
int getIndex(String s)
	{
	int i=0;
	while(s.compareToIgnoreCase(lstWord.getItem(i).toString())>0)
		{
			i++;
			if(i==lstWord.getItemCount()-1) break;
			}
		return i;
	}
public static void main(String arg[])
	{
		new MainDic();
	}

}