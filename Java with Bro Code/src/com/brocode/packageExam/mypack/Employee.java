package mypack;
import mypack.objs.*;
public class Employee extends Person
{
	public String position;
	public int salary;
	public String org;
public Employee(){
super();
}
public Employee(String name,String sex,int age,String position,int salary,String org)
{
super(name,sex,age);
this.position=position;
this.salary=salary;
this.org=org;

}
public void show()// overiding method
	{
		super.show();
		System.out.println("==========================");
		System.out.println("Employee Information");
		System.out.println("Position:"+position);
		System.out.println("Salary:"+salary);
		System.out.println("Organization:"+org);
	}

}