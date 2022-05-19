import javax.swing.*;
import java.awt.*;
class RunNum extends JLabel implements Runnable
{
boolean isRun;

RunNum(){
		super("   ");
		setFont(new Font("Arial",Font.BOLD,30));
		setForeground(Color.RED);
	}

void stopRun(){
		isRun=false;
	}

public void run(){
	isRun=true;
	
	{
		while(isRun)
		{
			int n=(int)(Math.random()*10);
			this.setText(" " +n);
			try{
				Thread.sleep(100);
			}
			catch(Exception ex){}
		}



	}


}
}