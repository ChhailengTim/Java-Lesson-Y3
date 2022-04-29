import java.io.*;
class StrReader
{
public static void main(String arg[])
	{
	try
		{
			ObjectInputStream f=new ObjectInputStream(new FileInputStream("StrObj.dat"));
			while(true)
				{
					String data=(String) f.readObject();
					if(data!=null)
					System.out.println(data);
					else
						break;
				}
			f.close();	
		}
catch(Exception ex){}	
	}
}