import java.util.*;
class Napoleon
{

int getNCode(char c)
	{
		int ncode=(int) c;// ascii code;
		ncode=(ncode-64)%9;
		if (ncode==0)
			ncode=9;
		else
			if(ncode<0)
				ncode=0;

		return ncode;
	}
String getTotalName(String name1,String name2)
	{
		String name11="";//name1 after samroul, name2 samroul directly.
		for(int i=0;i<name1.length();i++)
			{
				String findChar=name1.charAt(i)+"";
				int fi=name2.indexOf(findChar);// check findChar in name2 if return -1 not found
				if(fi==-1)
					name11=name11+findChar;
				else
					name2=name.replaceFirst(findChar,"");	
			}
		return name11+name2;
	}

Napoleon(){
		System.out.print("Enter a name");
		String name=new Scanner(System.in).nextLine().toUpperCase();
		int ttcode=0;
		for(int i=0;i<name.length();i++)
			{
				ttcode=ttcode+getNCode(name.charAt(i));
				//System.out.print(getNCode(name.charAt(i)));
			}
		System.out.println("Your total code is "+ttcode);
			int ncode=ttcode%9;
			if (ncode==0)
				ncode=9;
		System.out.println("Your Napoleon code is "+ncode);
	}

public static void main(String arg[])

	{
		new Napoleon();		
	}
}