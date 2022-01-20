import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
class JDic extends JFrame
{
	JTextField txtFind=new JTextField(40);
	JButton bGo=new JButton(" Go ");
	JButton bClose=new JButton("Close");
	JList lst;
	JTextArea txtTranslate=new JTextArea();
	Vector<Word> v=new Vector<Word>();
	void doDesign()
	{
		JPanel p=new JPanel();
		p.add(new JLabel(" Word : "));
		p.add(txtFind);
		p.add(bGo);
		p.add(bClose);
		this.add("North",p);
		p=new JPanel(new GridLayout(1,2,50,0));
		setData();
		p.add(new JScrollPane(lst));p.add(txtTranslate);
		this.add(p);
	}
void setData()
	{
		v.add(new Word("Apple","(N) A kind fruit,...."));
		v.add(new Word("Zoo","(N) Animal show room"));
		v.add(new Word("Boy","(N) Male Tenager"));
		v.add(new Word("Baby","(N) New born person"));
		v.add(new Word("Super","(Adj) Very Very ..."));
		v.add(new Word("Black","(Adj) A very dark color"));
		v.add(new Word("Boom","(V) Say boom boom"));

		Collections.sort(v);
		lst=new JList(v);	
	}
JDic(){
	doDesign();
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	bClose.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){doClose();}});
	lst.addListSelectionListener(new ListSelectionListener(){public void valueChanged(ListSelectionEvent e){doSelect();}});
	setSize(800,700);
	setTitle("JDictionary");
	setVisible(true);
	}
void doSelect(){
int i=lst.getSelectedIndex();
txtTranslate.setText(v.get(i).translate);
}
void doClose(){
	int c=JOptionPane.showConfirmDialog(this,"Are you sure want to exit?","I ask you!",JOptionPane.YES_NO_OPTION);
	if(c==JOptionPane.YES_OPTION) System.exit (0);
}
public static void main(String arg[]){
new JDic();
}
}
