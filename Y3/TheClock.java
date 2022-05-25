import java.awt.*;
import javax.swing.*;
class TheClock extends JFrame
{
class RunClock extends Thread
	{

		
	void drawCircle(int x,int y,int r)
		{
			Graphics g=getGraphics();
			g.setColor(Color.RED);
			g.drawOval(x-r,y-r,2*r,2*r);
			g.drawOval(x-5,y-5,10,10);
		}
	void drawR(int x1,int y1,int x2,int y2,Color c)
		{
			Graphics g=getGraphics();
			g.setColor(c);
			g.drawLine(x1,y1,x2,y2);
		}
	public void run()
		{
			int x1,y1,x2,y2,r;
			r=250;
			x1=400;y1=400;
			double alpha=0;
			while(true)
			{
				drawCircle(x1,y1,r);
				x2=(int)(x1+Math.cos(alpha)*r);
				y2=(int)(y1+Math.sin(alpha)*r);
				drawR(x1,y1,x2,y2,Color.BLUE);
				try{
					Thread.sleep(1000);
				}
				catch(Exception ex){}
				drawR(x1,y1,x2,y2,getContentPane().getBackground());
				alpha=alpha+Math.PI/30;

			}
		}
	}


TheClock()
{
	setTitle("The Clock");
	setSize(1000,1000);
	setLocation(100,100);
	getContentPane().setBackground(Color.BLACK);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	new RunClock().start();
}

public static void main(String arg[])
{
new TheClock();
}

}