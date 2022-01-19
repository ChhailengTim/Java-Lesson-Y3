import java.awt.*;
import java.awt.event.*;
class LogOn extends Frame
{
	TextField txtUser=new TextField();
	TextField txtPwd=new TextField();
	Button bOK=new Button(" OK ");
	Button bCancel=new Button("Cancel");
	void doDesign()
	{	
		Panel p=new Panel();
		p.add(new Label("Please input user and password"));
		this.add("North",p);
		p=new Panel(new GridLayout(2,2,50,30));
		p.add(new Label(" User name : "));p.add(txtUser);
		p.add(new Label(" Password : "));p.add(txtPwd);
		this.add(p);//center default
		p=new Panel();
		p.add(bOK);
		p.add(bCancel);
		this.add("South",p);
	}
	LogOn()
		{
			doDesign();
			bCancel.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){doExit(e);}});
			bOK.addActionListener(new BOKClick());
			this.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent ev){System.exit(0);}});
			setTitle("Log on.....");
			setSize(300,250);
			setLocation(200,100);
			setVisible(true);
		}
	class BOKClick implements ActionListener{
			public void actionPerformed(ActionEvent e)
			{
				txtUser.setText("");
				txtPwd.setText("");
				txtUser.requestFocus();
			}
		}
	public void doExit(ActionEvent e){
			System.exit(0);
		}	
	public static void main(String arg[]){
		new LogOn();	
	}
}