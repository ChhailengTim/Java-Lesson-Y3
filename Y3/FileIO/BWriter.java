import java.io.*;
class BWriter
{
public static void main(String arg[])throws Exception
{
	DataOutputStream f=new DataOutputStream(new FileOutputStream("bdata.dat"));
	f.writeInt(10);
	f.writeDouble(10.0);
	f.writeChar('A');
	f.close();
	System.out.println("Data saved");

}
}