//for maping Customer Record to Customer Object
class Customer
{
String name;
String address;
String phone;
Customer(){}
Customer(String name,String address,String phone)
{
	this.name=name;
	this.address=address;
	this.phone=phone;
}
public String toString(){return name;}
}