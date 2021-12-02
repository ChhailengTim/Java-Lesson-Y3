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