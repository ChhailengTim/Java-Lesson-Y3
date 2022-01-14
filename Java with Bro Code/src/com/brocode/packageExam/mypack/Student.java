package mypack;
import mypack.objs.*;
public class Student extends Person
{
	public String schoolName;
	public String field;
	public int y;
	public Student(){}
	public Student(String name,String sex,int age,String school,String field,int y)
	{
		super(name,sex,age);
		schoolName=school;
		this.field=field;
		this.y=y;	
	}
	public void show() //overide method show()
	{
		super.show();
		System.out.println("Student Information");
		System.out.println("School : "+schoolName);
		System.out.println("Field or Skill : "+field);
		System.out.println("Year :"+y);
			
	}
}
