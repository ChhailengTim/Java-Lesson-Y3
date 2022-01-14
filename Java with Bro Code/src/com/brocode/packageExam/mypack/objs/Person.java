package mypack.objs;
public class Person
{
	public String name;
	public String sex;
	public int age;

public Person(String name,String sex,int age)
	{
	 	this.name=name;
		this.sex=sex;
		this.age=age;
	}
public Person(){}// Default Constuctor overload
public void show()
	{
		System.out.println("Personal Information!!");
		System.out.println("Name : "+this.name);
		System.out.println("Sex : "+this.sex);
		System.out.println("Age : "+this.age);
		
	
	}


}