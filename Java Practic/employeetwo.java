import java.io.*;
class Employee
{
	String name;
	int age;
	String desgination;
	double salary;
	public Employee(String name)
	{
		this.name=name;
	}
	public void setAge(int empAge)
	{
		age=empAge;
	}
	public void setDesgination(String empDesign)
	{
		desgination=empDesign;
	}
	public void setSalary(double empSal)
	{
		salary=empSal;
	}
	public void printEmp()
	{
		System.out.println();
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Desgination : "+desgination);
		System.out.println("Salary : "+salary);
	}
}
class employeetwo
{
	public static void main(String[]args)
	{
		Employee empOne=new Employee("Kinglord");
		Employee empTwo=new Employee("DarkShadow");
		empOne.setAge(21);
		empOne.setDesgination("Developer");
		empOne.setSalary(18000);
		empOne.printEmp();
		
		empTwo.setAge(22);
		empTwo.setDesgination("Tester");
		empTwo.setSalary(19800);
		empTwo.printEmp();
	}
}
		