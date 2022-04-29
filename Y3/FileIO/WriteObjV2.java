import java.io.*;
import java.util.*;
class WriteObjV2
{
public static void main(String arg[])
{
try{
	ObjectOutputStream f=new ObjectOutputStream(new FileOutputStream("ObjWords.dat"));
	Vector<Word> v=new Vector<Word>();
	v.add(new Word("Apple","(N) A kind of fruite"));
	v.add(new Word("Baby","(N) Sweet heart"));
	v.add(new Word("Hello","(V) Say greating!!!"));
	v.add(new Word("Cat","(N) Meo Meo"));
	v.add(new Word("Zoo","(N) Animal show room"));
	v.add(new Word("Beatiful","(Adj) look..."));
	Collections.sort(v);
	f.writeObject(v);
	f.close();
	System.out.println("Noted: Word saved!!");
}
catch(Exception ex)
	{
		System.out.println(ex.toString());
	}

}
}