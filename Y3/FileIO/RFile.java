import java.io.*;
class RFile{
public static void main(String arg[]) throws Exception
{
	FileInputStream f=new FileInputStream("data.txt");
	String data="";
	while(true)
		{
			int code=f.read();
			if(code==-1) break;
			data=data+(char) code;
		}
	System.out.println("Content of file is....");
	System.out.println(data);

}
}