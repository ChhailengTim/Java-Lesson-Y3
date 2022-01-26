import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
class JDic extends JFrame
{
	JMenu mFile=new JMenu("File");
	JMenuItem mNew=new JMenuItem("New Word");
	JMenuItem mPreview=new JMenuItem("Preview");
	JMenuItem mExit=new JMenuItem("Exit");
	
	JPopupMenu mPop=new JPopupMenu("Edit");
	JDesktopPane mdi=new JDesktopPane();
	
	JTextField txtFind=new JTextField(40);
	JButton bGo=new JButton(" Go ");
	JButton bClose=new JButton("Close");
	JList lst=new JList();
	JTextArea txtTranslate=new JTextArea();
	Vector<Word> v=new Vector<Word>();
	void doDesign()
	{
	this.add(mdi);
			mFile.add(mNew);
			mFile.add(mPreview);
			//mFile.addSeparator();
			//mFile.add(mExit);
			JMenuBar b=new JMenuBar();
			b.add(mFile);
			setJMenuBar(b);	
/*		JPanel p=new JPanel();
		p.add(new JLabel(" Word : "));
		p.add(txtFind);
		p.add(bGo);
		p.add(bClose);
		this.add("North",p);
		p=new JPanel(new GridLayout(1,2,50,0));
		setData();
		p.add(new JScrollPane(lst));p.add(txtTranslate);
		this.add(p);
*/
		//Design Menu
			
			mExit.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){doClose();}});
		//	mPop.add(mNew);
		//	mPop.add(mPreview);
			//this.add(mPop);
		//	lst.addMouseListener(new MouseAdapter(){public void mouseClicked(MouseEvent ev){doPopup(ev);}});
			
			mNew.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){callNewWord();}});
	}
void doPopup(MouseEvent e)
	{
		if(e.getButton()==3)
			mPop.show(e.getComponent(),e.getX(),e.getY());
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
public void callNewWord()
{
	JOptionPane.showMessageDialog(this,"Just test");
		NewWord f=new NewWord();
		f.setSize(400,300);
		mdi.add(f);
		f.show();
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
