package day2;

public class DemoEmployee 
{
	public static void main(String[] args)
	{
		//Declaring a object
	 Employee simmi;
	 //Instantiation(using new keyword) and Initialization(using Constructor)
	 simmi=new Employee();
	 
	 simmi.salary=40000;
	 simmi.bonus=8000;
	 
	 simmi.calculateSalary();
	 
	 Employee A = new Employee();
	 A.bonus=1000;
	 A.salary=2000;
	int varSalary= A.calculateSalary1();
	System.out.println("Salary of A is: "+varSalary);
	
	Employee B =new Employee();
	B.salary=5000;
	B.bonus=2000;
	B.calculateSalary1(10000, 10000);
	
	
	}
}
