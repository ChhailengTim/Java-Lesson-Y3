import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
class RunPhone extends JLabel implements Runnable
{
Vector<Customer> v=new Vector<Customer>();
int indx;
boolean isRun;
private void loadData()throws Exception

{
	Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	Connection cn=DriverManager.getConnection("jdbc:ucanaccess://C:\\E7\\Threads\\CustomerList.accdb");
	Statement stm=cn.createStatement();
	ResultSet rs=stm.executeQuery("Select * from Customers");
	while(rs.next())
		v.add(new Customer(rs.getString(1),rs.getString(2),rs.getString(3)));
	rs.close();
	stm.close();
	cn.close();

}
RunPhone()
	{
		super("Click Start To Select..");
		setFont(new Font("Arial",Font.BOLD,22));
		setForeground(Color.blue);
		try{
			loadData();
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.toString());
			return;
		}
	}

public void run()
	{
		isRun=true;
		while(isRun)
		{
			indx=(int)(Math.random()*v.size());
			this.setText(v.get(indx).phone);
			try{
			Thread.sleep(100);
			}
			catch(Exception ex)
			{
			
			}
		}
	}
void stopRun(){isRun=false;}
String getCustomerInfo()
	{
	return v.get(indx).name+ "( "+v.get(indx).address+ " )";
	}	

}