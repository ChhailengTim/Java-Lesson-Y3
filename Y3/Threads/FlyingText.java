import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class FlyingText extends JFrame
{

FlyingText()
	{
		getContentPane().setBackground(Color.BLACK);
		setTitle("Flying Text");
		setSize(1000,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		new RunText().start();		
	}
class RunText extends Thread{

	public void run()
		{
			Graphics g=getGraphics();
			int x=0;
			int y=300;
			int dx=10;
			g.setFont(new Font("Arial",Font.BOLD,30));
			int x1,y1;
			
			while(true)
				
				{
					g.setColor(Color.RED);
					g.drawString("CAMBODIA",x,y);
					try{
					   Thread.sleep(200);
					}
				catch(Exception ex){}
					x1=(int)(Math.random()*1000);
					y1=(int)(Math.random()*800);
					g.setColor(Color.yellow);
					g.fillOval(x1,y1,5,5);
					g.setColor(getContentPane().getBackground());// 
					g.drawString("CAMBODIA",x,y);//Clear
					x=x+dx;
					if(x>1000||x<0) dx=-dx;
				}
		}

}

public static void main(String arg[])

{
	new FlyingText();

}
}