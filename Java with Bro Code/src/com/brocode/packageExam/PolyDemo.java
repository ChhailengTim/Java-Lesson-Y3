import mypack.*;
import mypack.objs.*;
class PolyDemo
{
public static void main(String arg[])
	{
		Employee objEmp=new Employee("SOK SANTRAN","Male",25,"IT OFFICER",400,"RUPP CKCC");
		Student objStu=new Student("Sen Mohasory","Female",22,"RUPP","Information Technology",4);

		
		Person p1=objEmp;
		Person p2=objStu;
		System.out.println("+++++++++++++++++++++++++++++++++++");
		System.out.println("METHOD (show) are differents");
		System.out.println("+++++++++++++++++++++++++++++++++++");
		p1.show();
		System.out.println("----------------------------------------");	
		p2.show();
			
	}
}