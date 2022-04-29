import java.io.*;
class BReader{
public static void main(String arg[])throws Exception
{
DataInputStream f=new DataInputStream(new FileInputStream("bdata.dat"));
System.out.println(f.readInt());
System.out.println(f.readDouble());
System.out.println(f.readChar());
f.close();
}

}