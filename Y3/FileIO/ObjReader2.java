import java.io.*;
import java.util.*;
class ObjReader2
{
public static void main(String arg[])
	{
	try
		{
			ObjectInputStream f=new ObjectInputStream(new FileInputStream("ObjWords.dat"));
			Vector<Word> v=(Vector) f.readObject();
			f.close();
			for(int i=0;i<v.size();i++)
				v.get(i).display();
		}
catch(Exception ex){
	//System.out.println(ex.toString());
}	
	}
}