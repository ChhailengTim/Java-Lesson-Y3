import java.io.*;
class WFile
{
public static void main(String arg[])
	{
	String data1="Kingdom of Cambodia";
	String data2="Kingdom of Wonder";
	String data3="Welcome to Cambodia";
	try
	{
		FileOutputStream f=new FileOutputStream("data.txt",true);// create or append file at current folder
		String data=data1+"\r\n"+data2+"\r\n"+data3+"\r\n";
		for(int i=0;i<data.length();i++)
			f.write((int) data.charAt(i));
		f.close();
	System.out.println("Data save into file, check it!!!!");	
	}
catch(Exception ex){
System.out.println(ex.toString());
}	

	}

}