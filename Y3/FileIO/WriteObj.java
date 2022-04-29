import java.io.*;
class WriteObj
{
public static void main(String arg[])
{
try{
	ObjectOutputStream f=new ObjectOutputStream(new FileOutputStream("Objs.dat"));
	f.writeObject(new Word("Apple","(N) A kind of fruite"));
	f.writeObject(new Word("Baby","(N) Sweet heart"));
	f.writeObject(new Word("Hello","(V) Say greating!!!"));
	f.writeObject(new Word("Cat","(N) Meo Meo"));
	f.close();
	System.out.println("Noted: Word saved!!");
}
catch(Exception ex)
	{
		System.out.println(ex.toString());
	}

}
}