import java.io.*;
class StrWriter
{
public static void main(String arg[])
{
try{
	ObjectOutputStream f=new ObjectOutputStream(new FileOutputStream("StrObj.dat"));
	f.writeObject("Hello world");
	f.writeObject("Kingdom of Cambodia");
	f.writeObject("Kingdom of Wonder");
	f.writeObject("You can...");
	f.close();
	System.out.println("Noted: object string save!!");
}
catch(Exception ex)
	{
	}

}
}