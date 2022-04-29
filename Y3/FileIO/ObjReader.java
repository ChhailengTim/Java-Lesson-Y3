import java.io.*;
class ObjReader
{
public static void main(String arg[])
	{
	try
		{
			ObjectInputStream f=new ObjectInputStream(new FileInputStream("objs.dat"));
			while(true)
				{
					Word data=(Word) f.readObject();
					if(data!=null)
						data.display();
					else
						break;
				}
			f.close();	
		}
catch(Exception ex){
	//System.out.println(ex.toString());
}	
	}
}